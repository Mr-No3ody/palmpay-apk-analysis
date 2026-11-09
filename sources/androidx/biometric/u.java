package androidx.biometric;

import android.security.identity.IdentityCredential;
import android.security.identity.PresentationSession;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Signature f13092a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Cipher f13093b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Mac f13094c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final IdentityCredential f13095d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final PresentationSession f13096e;

    public u(Signature signature) {
        this.f13092a = signature;
        this.f13093b = null;
        this.f13094c = null;
        this.f13095d = null;
        this.f13096e = null;
    }

    public u(Cipher cipher) {
        this.f13092a = null;
        this.f13093b = cipher;
        this.f13094c = null;
        this.f13095d = null;
        this.f13096e = null;
    }

    public u(Mac mac) {
        this.f13092a = null;
        this.f13093b = null;
        this.f13094c = mac;
        this.f13095d = null;
        this.f13096e = null;
    }

    public u(IdentityCredential identityCredential) {
        this.f13092a = null;
        this.f13093b = null;
        this.f13094c = null;
        this.f13095d = identityCredential;
        this.f13096e = null;
    }

    public u(PresentationSession presentationSession) {
        this.f13092a = null;
        this.f13093b = null;
        this.f13094c = null;
        this.f13095d = null;
        this.f13096e = presentationSession;
    }
}
