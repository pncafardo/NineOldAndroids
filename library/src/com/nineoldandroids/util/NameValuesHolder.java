package com.nineoldandroids.util;

/**
 * This is the information we need to set each property during the animation.
 * mNameConstant is used to set the appropriate field in View, and the from/delta
 * values are used to calculate the animated value for a given animation fraction
 * during the animation.
 */
public class NameValuesHolder
{
    private int mNameConstant;
    private float mFromValue;
    private float mDeltaValue;

    public NameValuesHolder(int nameConstant, float fromValue, float deltaValue)
    {
        mNameConstant = nameConstant;
        mFromValue = fromValue;
        mDeltaValue = deltaValue;
    }

    public int getNameConstant()
    {
        return mNameConstant;
    }

    public float getFromValue()
    {
        return mFromValue;
    }

    public float getDeltaValue()
    {
        return mDeltaValue;
    }
}
