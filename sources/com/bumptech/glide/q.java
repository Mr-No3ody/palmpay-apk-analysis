package com.bumptech.glide;

import com.bumptech.glide.request.transition.TransitionFactory;

/* JADX INFO: loaded from: classes.dex */
public abstract class q implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public TransitionFactory f21077a = com.bumptech.glide.request.transition.b.f21079b;

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final q clone() {
        try {
            return (q) super.clone();
        } catch (CloneNotSupportedException e10) {
            throw new RuntimeException(e10);
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof q) {
            return J1.o.b(this.f21077a, ((q) obj).f21077a);
        }
        return false;
    }

    public int hashCode() {
        TransitionFactory transitionFactory = this.f21077a;
        if (transitionFactory != null) {
            return transitionFactory.hashCode();
        }
        return 0;
    }
}
