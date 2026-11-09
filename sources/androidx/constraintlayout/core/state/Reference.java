package androidx.constraintlayout.core.state;

import Q.e;
import androidx.constraintlayout.core.state.helpers.Facade;

/* JADX INFO: loaded from: classes.dex */
public interface Reference {
    void apply();

    e getConstraintWidget();

    Facade getFacade();

    Object getKey();

    void setConstraintWidget(e eVar);

    void setKey(Object obj);
}
