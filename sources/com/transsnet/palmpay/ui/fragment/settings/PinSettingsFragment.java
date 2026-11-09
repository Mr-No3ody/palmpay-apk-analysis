package com.transsnet.palmpay.ui.fragment.settings;

import Ac.k;
import Gb.HandlerC0283f;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import androidx.preference.PreferenceScreen;
import androidx.preference.q;
import androidx.preference.r;
import com.palmpay.lib.apm.launchcounter.util.d;
import com.transsnet.palmpay.account.bean.req.SecurityVerifyMethodReq;
import com.transsnet.palmpay.base.BasePreferenceFragment;

/* JADX INFO: loaded from: classes4.dex */
public class PinSettingsFragment extends BasePreferenceFragment implements Preference.OnPreferenceChangeListener, Preference.OnPreferenceClickListener {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Preference f35279o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Preference f35280p;

    @Override // com.transsnet.palmpay.base.BasePreferenceFragment, androidx.preference.PreferenceFragmentCompat
    public final void g() {
        int i7 = k.main_pref_pin_setting;
        r rVar = this.f17585b;
        if (rVar == null) {
            throw new RuntimeException("This should be called after super.onCreate.");
        }
        Context context = getContext();
        PreferenceScreen preferenceScreen = this.f17585b.f17664g;
        rVar.f17662e = true;
        q qVar = new q(context, rVar);
        XmlResourceParser xml = context.getResources().getXml(i7);
        try {
            PreferenceGroup preferenceGroupC = qVar.c(xml, preferenceScreen);
            xml.close();
            PreferenceScreen preferenceScreen2 = (PreferenceScreen) preferenceGroupC;
            preferenceScreen2.j(rVar);
            SharedPreferences.Editor editor = rVar.f17661d;
            if (editor != null) {
                editor.apply();
            }
            rVar.f17662e = false;
            r rVar2 = this.f17585b;
            PreferenceScreen preferenceScreen3 = rVar2.f17664g;
            if (preferenceScreen2 != preferenceScreen3) {
                if (preferenceScreen3 != null) {
                    preferenceScreen3.m();
                }
                rVar2.f17664g = preferenceScreen2;
                this.f17587d = true;
                if (this.f17588e) {
                    HandlerC0283f handlerC0283f = this.f17590g;
                    if (handlerC0283f.hasMessages(1)) {
                        return;
                    }
                    handlerC0283f.obtainMessage(1).sendToTarget();
                }
            }
        } catch (Throwable th) {
            xml.close();
            throw th;
        }
    }

    @Override // com.transsnet.palmpay.base.BasePreferenceFragment, androidx.preference.PreferenceFragmentCompat, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        r rVar = this.f17585b;
        PreferenceScreen preferenceScreen = rVar.f17664g;
        Preference preferenceX = preferenceScreen == null ? null : preferenceScreen.x("key_reset_pin");
        this.f35279o = preferenceX;
        preferenceX.f17555e = this;
        PreferenceScreen preferenceScreen2 = rVar.f17664g;
        Preference preferenceX2 = preferenceScreen2 != null ? preferenceScreen2.x("key_change_pin") : null;
        this.f35280p = preferenceX2;
        preferenceX2.f17555e = this;
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // androidx.preference.Preference.OnPreferenceChangeListener
    public final boolean onPreferenceChange(Preference preference, Object obj) {
        return false;
    }

    @Override // androidx.preference.Preference.OnPreferenceClickListener
    public final boolean onPreferenceClick(Preference preference) {
        String str = preference.f17562p;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (str.equals(this.f35280p.f17562p)) {
            d.H("/account/verifyAccount", "extra_type", SecurityVerifyMethodReq.LOGIN_CHANGE_PIN);
            return true;
        }
        if (!str.equals(this.f35279o.f17562p)) {
            return true;
        }
        d.H("/account/verifyAccount", "extra_type", SecurityVerifyMethodReq.LOGIN_RESET_PIN);
        return true;
    }
}
