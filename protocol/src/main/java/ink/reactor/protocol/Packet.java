package ink.reactor.protocol;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public final class Packet {
    private int packetId;
    private PacketData data;
}
