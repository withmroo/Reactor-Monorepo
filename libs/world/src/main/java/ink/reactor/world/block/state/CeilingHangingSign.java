package ink.reactor.world.block.state;

public final class CeilingHangingSign {
    public static int of(final char id, final boolean attached, final long rotation, final boolean waterlogged) {
        final String sentence = attached+"-"+rotation+"-"+waterlogged;
        return switch(sentence) {
            case "true-0-true" -> id-33;
            case "true-0-false" -> id-32;
            case "true-1-true" -> id-31;
            case "true-1-false" -> id-30;
            case "true-2-true" -> id-29;
            case "true-2-false" -> id-28;
            case "true-3-true" -> id-27;
            case "true-3-false" -> id-26;
            case "true-4-true" -> id-25;
            case "true-4-false" -> id-24;
            case "true-5-true" -> id-23;
            case "true-5-false" -> id-22;
            case "true-6-true" -> id-21;
            case "true-6-false" -> id-20;
            case "true-7-true" -> id-19;
            case "true-7-false" -> id-18;
            case "true-8-true" -> id-17;
            case "true-8-false" -> id-16;
            case "true-9-true" -> id-15;
            case "true-9-false" -> id-14;
            case "true-10-true" -> id-13;
            case "true-10-false" -> id-12;
            case "true-11-true" -> id-11;
            case "true-11-false" -> id-10;
            case "true-12-true" -> id-9;
            case "true-12-false" -> id-8;
            case "true-13-true" -> id-7;
            case "true-13-false" -> id-6;
            case "true-14-true" -> id-5;
            case "true-14-false" -> id-4;
            case "true-15-true" -> id-3;
            case "true-15-false" -> id-2;
            case "false-0-true" -> id-1;
            case "false-1-true" -> id+1;
            case "false-1-false" -> id+2;
            case "false-2-true" -> id+3;
            case "false-2-false" -> id+4;
            case "false-3-true" -> id+5;
            case "false-3-false" -> id+6;
            case "false-4-true" -> id+7;
            case "false-4-false" -> id+8;
            case "false-5-true" -> id+9;
            case "false-5-false" -> id+10;
            case "false-6-true" -> id+11;
            case "false-6-false" -> id+12;
            case "false-7-true" -> id+13;
            case "false-7-false" -> id+14;
            case "false-8-true" -> id+15;
            case "false-8-false" -> id+16;
            case "false-9-true" -> id+17;
            case "false-9-false" -> id+18;
            case "false-10-true" -> id+19;
            case "false-10-false" -> id+20;
            case "false-11-true" -> id+21;
            case "false-11-false" -> id+22;
            case "false-12-true" -> id+23;
            case "false-12-false" -> id+24;
            case "false-13-true" -> id+25;
            case "false-13-false" -> id+26;
            case "false-14-true" -> id+27;
            case "false-14-false" -> id+28;
            case "false-15-true" -> id+29;
            case "false-15-false" -> id+30;
            default -> id;
        };
    }
}