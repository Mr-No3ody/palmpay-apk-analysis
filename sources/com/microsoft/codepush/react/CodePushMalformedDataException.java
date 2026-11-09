package com.microsoft.codepush.react;

import C0.G;
import N8.q0;
import java.net.MalformedURLException;

/* JADX INFO: loaded from: classes3.dex */
public class CodePushMalformedDataException extends RuntimeException {
    public CodePushMalformedDataException(String str, Throwable th) {
        super(q0.k("Unable to parse contents of ", str, ", the file may be corrupted."), th);
    }

    public CodePushMalformedDataException(String str, MalformedURLException malformedURLException) {
        super(G.o("The package has an invalid downloadUrl: ", str), malformedURLException);
    }
}
