package com.setainternational.common.receiverevent;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.Instant;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ReceiverEventData {
  @JsonProperty("deviceid")
  private String deviceId;

  private String uri; // downstream topic to send the payload to

  @JsonProperty("payloadcontenttype")
  private String payloadContentType;

  @JsonProperty("payload_base64")
  private byte[] payloadBase64; // the wrapped payload, Protobuf going here

  @JsonProperty("expires_at")
  private Long expiresAt;

  @Builder.Default
  @JsonProperty("occurred_at")
  private Long occurredAt = Instant.now().toEpochMilli();
}
