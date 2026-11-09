package com.transsnet.palmpay.share;

import C9.ViewOnClickListenerC0146m;
import Nd.a;
import Nd.b;
import Nd.f;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class ShareChooseActivity extends Activity implements ShareChooseAdapter$ShareItemOnclickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public RecyclerView f34107a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public f f34108b;

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(b.share_choose_activity);
        getWindow().setGravity(80);
        getWindow().setLayout(-1, -2);
        setFinishOnTouchOutside(true);
        this.f34107a = (RecyclerView) findViewById(a.share_recyclerview);
        ((Button) findViewById(a.share_cancel_btn)).setOnClickListener(new ViewOnClickListenerC0146m(this, 6));
        ArrayList parcelableArrayListExtra = getIntent().getParcelableArrayListExtra("share_list");
        f fVar = new f();
        fVar.f6389a = this;
        fVar.f6390b = parcelableArrayListExtra;
        this.f34108b = fVar;
        fVar.f6391c = this;
        this.f34107a.setLayoutManager(new LinearLayoutManager(this, 0, false));
        this.f34107a.setAdapter(this.f34108b);
    }

    @Override // com.transsnet.palmpay.share.ShareChooseAdapter$ShareItemOnclickListener
    public final void onItemClick(ShareItem shareItem) {
        int i7 = shareItem.f34111c;
        if (i7 != 1) {
            String str = shareItem.f34113e;
            if (i7 == 2) {
                Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse("smsto:"));
                intent.putExtra("sms_body", str);
                List<ResolveInfo> listQueryIntentActivities = getPackageManager().queryIntentActivities(intent, 1);
                if (listQueryIntentActivities != null && !listQueryIntentActivities.isEmpty()) {
                    startActivity(intent);
                }
            } else if (i7 == 3) {
                Intent intent2 = new Intent();
                intent2.setAction("android.intent.action.SEND");
                intent2.putExtra("android.intent.extra.TEXT", str);
                intent2.setType("text/plain");
                intent2.setPackage("com.whatsapp");
                List<ResolveInfo> listQueryIntentActivities2 = getPackageManager().queryIntentActivities(intent2, 1);
                if (listQueryIntentActivities2 != null && !listQueryIntentActivities2.isEmpty()) {
                    startActivity(intent2);
                }
            }
        }
        finish();
    }
}
