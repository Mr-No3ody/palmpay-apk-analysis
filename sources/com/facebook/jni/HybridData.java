package com.facebook.jni;

import D3.a;
import com.facebook.jni.annotations.DoNotStripAny;

/* JADX INFO: loaded from: classes.dex */
@DoNotStripAny
public class HybridData {
    private final Destructor mDestructor = new Destructor(this);

    @DoNotStripAny
    public static class Destructor extends DestructorThread.Destructor {
        private volatile long mNativePointer;

        public Destructor(Object obj) {
            super(obj);
        }

        public static native void deleteNative(long j6);

        @Override // com.facebook.jni.DestructorThread.Destructor
        public final void destruct() {
            deleteNative(this.mNativePointer);
            this.mNativePointer = 0L;
        }
    }

    static {
        a.r("fbjni");
    }

    public boolean isValid() {
        return this.mDestructor.mNativePointer != 0;
    }

    public synchronized void resetNative() {
        this.mDestructor.destruct();
    }
}
