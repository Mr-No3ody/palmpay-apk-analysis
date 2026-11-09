package com.nimbusds.jose.shaded.gson;

import N8.q0;
import java.io.IOException;
import java.math.BigDecimal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public abstract class y implements ToNumberStrategy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u f23722a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final v f23723b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final w f23724c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ y[] f23725d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.nimbusds.jose.shaded.gson.v] */
    static {
        u uVar = new u();
        f23722a = uVar;
        ?? r3 = new y() { // from class: com.nimbusds.jose.shaded.gson.v
            @Override // com.nimbusds.jose.shaded.gson.ToNumberStrategy
            public final Number readNumber(com.nimbusds.jose.shaded.gson.stream.b bVar) {
                return new com.nimbusds.jose.shaded.gson.internal.h(bVar.u());
            }
        };
        f23723b = r3;
        w wVar = new w();
        f23724c = wVar;
        f23725d = new y[]{uVar, r3, wVar, new y() { // from class: com.nimbusds.jose.shaded.gson.x
            @Override // com.nimbusds.jose.shaded.gson.ToNumberStrategy
            public final Number readNumber(com.nimbusds.jose.shaded.gson.stream.b bVar) throws IOException {
                String strU = bVar.u();
                try {
                    return new BigDecimal(strU);
                } catch (NumberFormatException e10) {
                    StringBuilder sbQ = q0.q("Cannot parse ", strU, "; at path ");
                    sbQ.append(bVar.i());
                    throw new P0.c(10, sbQ.toString(), e10);
                }
            }
        }};
    }

    public static y valueOf(String str) {
        return (y) Enum.valueOf(y.class, str);
    }

    public static y[] values() {
        return (y[]) f23725d.clone();
    }
}
