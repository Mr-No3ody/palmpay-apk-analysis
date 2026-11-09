package org.greenrobot.eventbus.meta;

import org.greenrobot.eventbus.i;

/* JADX INFO: loaded from: classes4.dex */
public interface SubscriberInfo {
    Class<?> getSubscriberClass();

    i[] getSubscriberMethods();

    SubscriberInfo getSuperSubscriberInfo();

    boolean shouldCheckSuperclass();
}
