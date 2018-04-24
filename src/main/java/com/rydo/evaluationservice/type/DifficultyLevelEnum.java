package com.rydo.evaluationservice.type;

/**
 * @author faizanmalik
 *         creation date 4/24/18
 */
public enum DifficultyLevelEnum {
    BEGINNER(1),
    MEDIUM(2),
    EXPERT(3);

    /**
     * Value for this difficulty level
     */
    public final int code;

    private DifficultyLevelEnum(int code)
    {
        this.code = code;
    }
}
