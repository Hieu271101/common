package com.setainternational.common.receiverevent;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.Instant;
import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ReceiverEvent {
  @Builder.Default
  @JsonProperty("type")
  private String type = "message.dispatch.upstream";

  @Builder.Default
  @JsonProperty("specversion")
  private String specVersion = "1.0";

  @JsonProperty("source")
  private String source;

  @Builder.Default
  @JsonProperty("deviceid")
  private UUID id = UUID.randomUUID();

  @Builder.Default
  @JsonProperty("time")
  private Long time = Instant.now().toEpochMilli();

  @Builder.Default
  @JsonProperty("datacontenttype")
  private String dataContentType = "application/json";

  @JsonProperty("data")
  private ReceiverEventData data;
}
