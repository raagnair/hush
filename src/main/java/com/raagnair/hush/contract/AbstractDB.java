package com.raagnair.hush.contract;

public abstract class AbstractDB {
    public abstract <X extends AbstractDBEntity> X readKey(Class<X> cls, String key);
}
