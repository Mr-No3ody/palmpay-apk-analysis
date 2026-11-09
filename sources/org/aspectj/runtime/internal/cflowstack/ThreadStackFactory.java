package org.aspectj.runtime.internal.cflowstack;

/* JADX INFO: loaded from: classes4.dex */
public interface ThreadStackFactory {
    ThreadCounter getNewThreadCounter();

    ThreadStack getNewThreadStack();
}
