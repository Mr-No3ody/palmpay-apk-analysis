package com.appsflyer;

import android.content.Context;
import android.security.keystore.KeyGenParameterSpec;
import java.io.IOException;
import java.math.BigInteger;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.util.Calendar;
import java.util.Enumeration;
import javax.security.auth.x500.X500Principal;

/* JADX INFO: loaded from: classes.dex */
public class AFKeystoreWrapper {
    private Context getCurrencyIso4217Code;
    public KeyStore getMonetizationNetwork;
    public final Object AFAdRevenueData = new Object();
    public String getRevenue = "";
    public int getMediationNetwork = 0;

    public AFKeystoreWrapper(Context context) {
        this.getCurrencyIso4217Code = context;
        AFLogger.afInfoLog("Initialising KeyStore..");
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            this.getMonetizationNetwork = keyStore;
            keyStore.load(null);
        } catch (IOException | KeyStoreException | NoSuchAlgorithmException | CertificateException e10) {
            AFLogger.afErrorLog("Couldn't load keystore instance of type: AndroidKeyStore", e10);
        }
    }

    private static boolean getMonetizationNetwork(String str) {
        return str.startsWith("com.appsflyer");
    }

    public final boolean getCurrencyIso4217Code() {
        boolean z3;
        synchronized (this.AFAdRevenueData) {
            try {
                KeyStore keyStore = this.getMonetizationNetwork;
                z3 = false;
                if (keyStore != null) {
                    try {
                        Enumeration<String> enumerationAliases = keyStore.aliases();
                        while (enumerationAliases.hasMoreElements()) {
                            String strNextElement = enumerationAliases.nextElement();
                            if (strNextElement != null && getMonetizationNetwork(strNextElement)) {
                                String[] strArrSplit = strNextElement.split(",");
                                if (strArrSplit.length != 3) {
                                    break;
                                }
                                AFLogger.afInfoLog("Found a matching AF key with alias:\n".concat(strNextElement));
                                z3 = true;
                                String[] strArrSplit2 = strArrSplit[1].trim().split("=");
                                String[] strArrSplit3 = strArrSplit[2].trim().split("=");
                                if (strArrSplit2.length != 2 || strArrSplit3.length != 2) {
                                    break;
                                    break;
                                }
                                this.getRevenue = strArrSplit2[1].trim();
                                this.getMediationNetwork = Integer.parseInt(strArrSplit3[1].trim());
                                break;
                            }
                        }
                    } catch (Throwable th) {
                        StringBuilder sb2 = new StringBuilder("Couldn't list KeyStore Aliases: ");
                        sb2.append(th.getClass().getName());
                        AFLogger.afErrorLog(sb2.toString(), th);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z3;
    }

    public final void getMediationNetwork(String str) {
        AFLogger.afInfoLog("Creating a new key with alias: ".concat(String.valueOf(str)));
        try {
            Calendar calendar = Calendar.getInstance();
            Calendar calendar2 = Calendar.getInstance();
            calendar2.add(1, 5);
            synchronized (this.AFAdRevenueData) {
                try {
                    if (this.getMonetizationNetwork.containsAlias(str)) {
                        AFLogger.afInfoLog("Alias already exists: ".concat(String.valueOf(str)));
                    } else {
                        KeyGenParameterSpec keyGenParameterSpecBuild = new KeyGenParameterSpec.Builder(str, 3).setCertificateSubject(new X500Principal("CN=AndroidSDK, O=AppsFlyer")).setCertificateSerialNumber(BigInteger.ONE).setCertificateNotBefore(calendar.getTime()).setCertificateNotAfter(calendar2.getTime()).build();
                        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA", "AndroidKeyStore");
                        keyPairGenerator.initialize(keyGenParameterSpecBuild);
                        keyPairGenerator.generateKeyPair();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Throwable th2) {
            StringBuilder sb2 = new StringBuilder("Exception ");
            sb2.append(th2.getMessage());
            sb2.append(" occurred");
            AFLogger.afErrorLog(sb2.toString(), th2);
        }
    }

    public final int getRevenue() {
        int i7;
        synchronized (this.AFAdRevenueData) {
            i7 = this.getMediationNetwork;
        }
        return i7;
    }

    public final String getMonetizationNetwork() {
        StringBuilder sb2 = new StringBuilder("com.appsflyer,KSAppsFlyerId=");
        synchronized (this.AFAdRevenueData) {
            sb2.append(this.getRevenue);
            sb2.append(",KSAppsFlyerRICounter=");
            sb2.append(this.getMediationNetwork);
        }
        return sb2.toString();
    }

    public final String getMediationNetwork() {
        String str;
        synchronized (this.AFAdRevenueData) {
            str = this.getRevenue;
        }
        return str;
    }
}
