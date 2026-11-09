package com.didi.drouter.service;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public interface ICallService {

    public interface Type0<Result> {
        Result call();
    }

    public interface Type1<Param1, Result> {
        Result call(Param1 param1);
    }

    public interface Type2<Param1, Param2, Result> {
        Result call(Param1 param1, Param2 param2);
    }

    public interface Type3<Param1, Param2, Param3, Result> {
        Result call(Param1 param1, Param2 param2, Param3 param3);
    }

    public interface Type4<Param1, Param2, Param3, Param4, Result> {
        Result call(Param1 param1, Param2 param2, Param3 param3, Param4 param4);
    }

    public interface Type5<Param1, Param2, Param3, Param4, Param5, Result> {
        Result call(Param1 param1, Param2 param2, Param3 param3, Param4 param4, Param5 param5);
    }

    public interface TypeN<Result> {
        Result call(@NonNull Object... params);
    }

    <T> T call(Object... params);
}
