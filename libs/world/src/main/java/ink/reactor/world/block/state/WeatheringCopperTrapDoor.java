package ink.reactor.world.block.state;

public final class WeatheringCopperTrapDoor {
    public static int of(final char id, final BlockFacing facing, final BlockHalf half, final boolean open, final boolean powered, final boolean waterlogged) {
        final String sentence = facing+"-"+half+"-"+open+"-"+powered+"-"+waterlogged;
        return switch(sentence) {
            case "NORTH-TOP-true-true-true" -> id-15;
            case "NORTH-TOP-true-true-false" -> id-14;
            case "NORTH-TOP-true-false-true" -> id-13;
            case "NORTH-TOP-true-false-false" -> id-12;
            case "NORTH-TOP-false-true-true" -> id-11;
            case "NORTH-TOP-false-true-false" -> id-10;
            case "NORTH-TOP-false-false-true" -> id-9;
            case "NORTH-TOP-false-false-false" -> id-8;
            case "NORTH-BOTTOM-true-true-true" -> id-7;
            case "NORTH-BOTTOM-true-true-false" -> id-6;
            case "NORTH-BOTTOM-true-false-true" -> id-5;
            case "NORTH-BOTTOM-true-false-false" -> id-4;
            case "NORTH-BOTTOM-false-true-true" -> id-3;
            case "NORTH-BOTTOM-false-true-false" -> id-2;
            case "NORTH-BOTTOM-false-false-true" -> id-1;
            case "SOUTH-TOP-true-true-true" -> id+1;
            case "SOUTH-TOP-true-true-false" -> id+2;
            case "SOUTH-TOP-true-false-true" -> id+3;
            case "SOUTH-TOP-true-false-false" -> id+4;
            case "SOUTH-TOP-false-true-true" -> id+5;
            case "SOUTH-TOP-false-true-false" -> id+6;
            case "SOUTH-TOP-false-false-true" -> id+7;
            case "SOUTH-TOP-false-false-false" -> id+8;
            case "SOUTH-BOTTOM-true-true-true" -> id+9;
            case "SOUTH-BOTTOM-true-true-false" -> id+10;
            case "SOUTH-BOTTOM-true-false-true" -> id+11;
            case "SOUTH-BOTTOM-true-false-false" -> id+12;
            case "SOUTH-BOTTOM-false-true-true" -> id+13;
            case "SOUTH-BOTTOM-false-true-false" -> id+14;
            case "SOUTH-BOTTOM-false-false-true" -> id+15;
            case "SOUTH-BOTTOM-false-false-false" -> id+16;
            case "WEST-TOP-true-true-true" -> id+17;
            case "WEST-TOP-true-true-false" -> id+18;
            case "WEST-TOP-true-false-true" -> id+19;
            case "WEST-TOP-true-false-false" -> id+20;
            case "WEST-TOP-false-true-true" -> id+21;
            case "WEST-TOP-false-true-false" -> id+22;
            case "WEST-TOP-false-false-true" -> id+23;
            case "WEST-TOP-false-false-false" -> id+24;
            case "WEST-BOTTOM-true-true-true" -> id+25;
            case "WEST-BOTTOM-true-true-false" -> id+26;
            case "WEST-BOTTOM-true-false-true" -> id+27;
            case "WEST-BOTTOM-true-false-false" -> id+28;
            case "WEST-BOTTOM-false-true-true" -> id+29;
            case "WEST-BOTTOM-false-true-false" -> id+30;
            case "WEST-BOTTOM-false-false-true" -> id+31;
            case "WEST-BOTTOM-false-false-false" -> id+32;
            case "EAST-TOP-true-true-true" -> id+33;
            case "EAST-TOP-true-true-false" -> id+34;
            case "EAST-TOP-true-false-true" -> id+35;
            case "EAST-TOP-true-false-false" -> id+36;
            case "EAST-TOP-false-true-true" -> id+37;
            case "EAST-TOP-false-true-false" -> id+38;
            case "EAST-TOP-false-false-true" -> id+39;
            case "EAST-TOP-false-false-false" -> id+40;
            case "EAST-BOTTOM-true-true-true" -> id+41;
            case "EAST-BOTTOM-true-true-false" -> id+42;
            case "EAST-BOTTOM-true-false-true" -> id+43;
            case "EAST-BOTTOM-true-false-false" -> id+44;
            case "EAST-BOTTOM-false-true-true" -> id+45;
            case "EAST-BOTTOM-false-true-false" -> id+46;
            case "EAST-BOTTOM-false-false-true" -> id+47;
            case "EAST-BOTTOM-false-false-false" -> id+48;
            default -> id;
        };
    }
}