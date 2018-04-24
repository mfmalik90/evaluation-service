package com.rydo.evaluationservice.type;

/**
 * @author faizanmalik
 *         creation date 4/24/18
 */
public enum StandardEnum {
    FIRST(1),
    SECOND(2),
    THIRD(3),
    FOURTH(4),
    FIFTH(5),
    SIXTH(6),
    SEVENTH(7),
    EIGHTH(8),
    NINTH(9),
    TENTH(10),
    ELEVENTH(11),
    TWELFTH(12);

    /**
     * Value for this standard level
     */
    public final int code;

    private StandardEnum(int code)
    {
        this.code = code;
    }
}
