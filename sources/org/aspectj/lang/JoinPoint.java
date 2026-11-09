package org.aspectj.lang;

import org.aspectj.lang.reflect.SourceLocation;

/* JADX INFO: loaded from: classes4.dex */
public interface JoinPoint {

    public interface EnclosingStaticPart extends StaticPart {
    }

    public interface StaticPart {
        int getId();

        String getKind();

        Signature getSignature();

        SourceLocation getSourceLocation();

        String toLongString();

        String toShortString();

        String toString();
    }

    Object[] getArgs();

    String getKind();

    Signature getSignature();

    SourceLocation getSourceLocation();

    StaticPart getStaticPart();

    Object getTarget();

    Object getThis();

    String toLongString();

    String toShortString();

    String toString();
}
