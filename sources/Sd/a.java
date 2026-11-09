package Sd;

import C9.N;
import K0.c;
import K0.g;
import K0.h;
import N0.d;
import androidx.room.G;
import androidx.room.I;
import androidx.work.impl.C1268a;
import androidx.work.impl.WorkDatabase_Impl;
import com.appsflyer.AdRevenueScheme;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import com.google.firebase.messaging.Constants;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.transsnet.adsdk.data.local.database.AdDatabase_Impl;
import com.transsnet.analysis.data.local.database.EventsDatabase_Impl;
import com.transsnet.palmpay.core.bean.cashier.FlexiOneClickOpenReq;
import com.transsnet.palmpay.core.db.RequestContactDB_Impl;
import com.transsnet.palmpay.teller.db.BillerSearchRecordDataBase_Impl;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends I {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f8867b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ G f8868c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(G g7, int i7) {
        super(1);
        this.f8867b = i7;
        this.f8868c = g7;
    }

    private final N g(d dVar) throws IOException {
        HashMap map = new HashMap(45);
        map.put("ad_id", new K0.b("ad_id", "TEXT", null, 1, 1, true));
        map.put("application_id", new K0.b("application_id", "TEXT", null, 0, 1, false));
        map.put("ad_slot_id", new K0.b("ad_slot_id", "TEXT", null, 0, 1, false));
        map.put("image_url", new K0.b("image_url", "TEXT", null, 0, 1, false));
        map.put("image_url_dark", new K0.b("image_url_dark", "TEXT", null, 0, 1, false));
        map.put("secondary_image_url", new K0.b("secondary_image_url", "TEXT", null, 0, 1, false));
        map.put("secondary_image_url_dark", new K0.b("secondary_image_url_dark", "TEXT", null, 0, 1, false));
        map.put("jump_type", new K0.b("jump_type", "TEXT", null, 0, 1, false));
        map.put("relative_url", new K0.b("relative_url", "TEXT", null, 0, 1, false));
        map.put("image_dimention", new K0.b("image_dimention", "TEXT", null, 0, 1, false));
        map.put("country_code", new K0.b("country_code", "TEXT", null, 0, 1, false));
        map.put("valid_start_time", new K0.b("valid_start_time", "INTEGER", null, 0, 1, true));
        map.put("valid_end_time", new K0.b("valid_end_time", "INTEGER", null, 0, 1, true));
        map.put("show_times", new K0.b("show_times", "INTEGER", null, 0, 1, true));
        map.put("show_times_condition", new K0.b("show_times_condition", "INTEGER", null, 0, 1, false));
        map.put("click_frequency", new K0.b("click_frequency", "INTEGER", null, 0, 1, false));
        map.put("max_close_count", new K0.b("max_close_count", "INTEGER", null, 0, 1, true));
        map.put("show_dates", new K0.b("show_dates", "TEXT", null, 0, 1, false));
        map.put("multiple_imageUrl", new K0.b("multiple_imageUrl", "TEXT", null, 0, 1, false));
        map.put("text_content", new K0.b("text_content", "TEXT", null, 0, 1, false));
        map.put("text_font_size", new K0.b("text_font_size", "TEXT", null, 0, 1, false));
        map.put("text_font_color", new K0.b("text_font_color", "TEXT", null, 0, 1, false));
        map.put("text_font_color_dark", new K0.b("text_font_color_dark", "TEXT", null, 0, 1, false));
        map.put("text_scroll_speed", new K0.b("text_scroll_speed", "TEXT", null, 0, 1, false));
        map.put("background_color", new K0.b("background_color", "TEXT", null, 0, 1, false));
        map.put("background_color_dark", new K0.b("background_color_dark", "TEXT", null, 0, 1, false));
        map.put(AdRevenueScheme.AD_TYPE, new K0.b(AdRevenueScheme.AD_TYPE, "INTEGER", null, 0, 1, true));
        map.put("native_ad_title", new K0.b("native_ad_title", "TEXT", null, 0, 1, false));
        map.put("native_ad_content", new K0.b("native_ad_content", "TEXT", null, 0, 1, false));
        map.put("native_ad_photo", new K0.b("native_ad_photo", "TEXT", null, 0, 1, false));
        map.put("show_close_button", new K0.b("show_close_button", "INTEGER", null, 0, 1, true));
        map.put("has_show_times", new K0.b("has_show_times", "INTEGER", null, 0, 1, true));
        map.put("show_date", new K0.b("show_date", "INTEGER", null, 0, 1, true));
        map.put("click_date", new K0.b("click_date", "INTEGER", null, 0, 1, true));
        map.put("close_time", new K0.b("close_time", "INTEGER", null, 0, 1, true));
        map.put("close_count", new K0.b("close_count", "INTEGER", null, 0, 1, true));
        map.put("create_time", new K0.b("create_time", "INTEGER", null, 0, 1, true));
        map.put("update_time", new K0.b("update_time", "INTEGER", null, 0, 1, true));
        map.put("current_enable", new K0.b("current_enable", "INTEGER", null, 0, 1, true));
        map.put("jump_params", new K0.b("jump_params", "TEXT", null, 0, 1, false));
        map.put("default_img_res", new K0.b("default_img_res", "INTEGER", null, 0, 1, true));
        map.put("text_icon_url", new K0.b("text_icon_url", "TEXT", null, 0, 1, false));
        map.put("text_icon_url_dark", new K0.b("text_icon_url_dark", "TEXT", null, 0, 1, false));
        map.put("alpha", new K0.b("alpha", "INTEGER", null, 0, 1, true));
        map.put("display_order", new K0.b("display_order", "INTEGER", null, 0, 1, true));
        HashSet hashSet = new HashSet(0);
        HashSet hashSet2 = new HashSet(1);
        hashSet2.add(new g("index_ad_detail_ad_id", true, Arrays.asList("ad_id"), Arrays.asList("ASC")));
        h hVar = new h("ad_detail", map, hashSet, hashSet2);
        h hVar2 = h.f4893e.read(dVar, "ad_detail");
        if (hVar.equals(hVar2)) {
            return new N(true, null, 3);
        }
        return new N(false, "ad_detail(com.transsnet.adsdk.data.local.entity.AdEntity).\n Expected:\n" + hVar + "\n Found:\n" + hVar2, 3);
    }

    @Override // androidx.room.I
    public final void a(d dVar) {
        switch (this.f8867b) {
            case 0:
                dVar.execSQL("CREATE TABLE IF NOT EXISTS `biller_search_record` (`recordId` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `memberId` TEXT, `searchText` TEXT, `updateTime` INTEGER NOT NULL)");
                dVar.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                dVar.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'cb5a7433ef0fe5a928245ea6010640fe')");
                break;
            case 1:
                dVar.execSQL("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                dVar.execSQL("CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
                dVar.execSQL("CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
                dVar.execSQL("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT NOT NULL, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL DEFAULT -1, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `generation` INTEGER NOT NULL DEFAULT 0, `next_schedule_time_override` INTEGER NOT NULL DEFAULT 9223372036854775807, `next_schedule_time_override_generation` INTEGER NOT NULL DEFAULT 0, `stop_reason` INTEGER NOT NULL DEFAULT -256, `trace_tag` TEXT, `required_network_type` INTEGER NOT NULL, `required_network_request` BLOB NOT NULL DEFAULT x'', `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
                dVar.execSQL("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
                dVar.execSQL("CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
                dVar.execSQL("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                dVar.execSQL("CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
                dVar.execSQL("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `generation` INTEGER NOT NULL DEFAULT 0, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`, `generation`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                dVar.execSQL("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                dVar.execSQL("CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
                dVar.execSQL("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                dVar.execSQL("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
                dVar.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                dVar.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '86254750241babac4b8d52996a675549')");
                break;
            case 2:
                dVar.execSQL("CREATE TABLE IF NOT EXISTS `request_contacts` (`contact_member_id` TEXT NOT NULL, `alias` TEXT, `full_name` TEXT, `is_favourite` TEXT, `is_friend` INTEGER NOT NULL, `phone` TEXT, `photo_path` TEXT, `request_source` TEXT, `create_time` INTEGER NOT NULL, `update_time` INTEGER NOT NULL, `expire_time` INTEGER NOT NULL, `own_member_id` TEXT NOT NULL, PRIMARY KEY(`contact_member_id`, `own_member_id`))");
                dVar.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                dVar.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '6c96b611ceb7162cf419f5abfd3b4792')");
                break;
            case 3:
                dVar.execSQL("CREATE TABLE IF NOT EXISTS `ad_detail` (`ad_id` TEXT NOT NULL, `application_id` TEXT, `ad_slot_id` TEXT, `image_url` TEXT, `image_url_dark` TEXT, `secondary_image_url` TEXT, `secondary_image_url_dark` TEXT, `jump_type` TEXT, `relative_url` TEXT, `image_dimention` TEXT, `country_code` TEXT, `valid_start_time` INTEGER NOT NULL, `valid_end_time` INTEGER NOT NULL, `show_times` INTEGER NOT NULL, `show_times_condition` INTEGER, `click_frequency` INTEGER, `max_close_count` INTEGER NOT NULL, `show_dates` TEXT, `multiple_imageUrl` TEXT, `text_content` TEXT, `text_font_size` TEXT, `text_font_color` TEXT, `text_font_color_dark` TEXT, `text_scroll_speed` TEXT, `background_color` TEXT, `background_color_dark` TEXT, `ad_type` INTEGER NOT NULL, `native_ad_title` TEXT, `native_ad_content` TEXT, `native_ad_photo` TEXT, `show_close_button` INTEGER NOT NULL, `has_show_times` INTEGER NOT NULL, `show_date` INTEGER NOT NULL, `click_date` INTEGER NOT NULL, `close_time` INTEGER NOT NULL, `close_count` INTEGER NOT NULL, `create_time` INTEGER NOT NULL, `update_time` INTEGER NOT NULL, `current_enable` INTEGER NOT NULL, `jump_params` TEXT, `default_img_res` INTEGER NOT NULL, `text_icon_url` TEXT, `text_icon_url_dark` TEXT, `alpha` INTEGER NOT NULL, `display_order` INTEGER NOT NULL, PRIMARY KEY(`ad_id`))");
                dVar.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS `index_ad_detail_ad_id` ON `ad_detail` (`ad_id`)");
                dVar.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                dVar.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'c33f582bbda7cb4cee66332b14fe8583')");
                break;
            default:
                dVar.execSQL("CREATE TABLE IF NOT EXISTS `events` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `data` TEXT, `create_time` INTEGER NOT NULL, `type` INTEGER NOT NULL)");
                dVar.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                dVar.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'fc2eab652f4147ec89e2d550e5582e32')");
                break;
        }
    }

    @Override // androidx.room.I
    public final void b(d db2) {
        switch (this.f8867b) {
            case 0:
                db2.execSQL("DROP TABLE IF EXISTS `biller_search_record`");
                List list = ((G) ((BillerSearchRecordDataBase_Impl) this.f8868c)).mCallbacks;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((C1268a) it.next()).getClass();
                        Intrinsics.checkNotNullParameter(db2, "db");
                    }
                }
                break;
            case 1:
                db2.execSQL("DROP TABLE IF EXISTS `Dependency`");
                db2.execSQL("DROP TABLE IF EXISTS `WorkSpec`");
                db2.execSQL("DROP TABLE IF EXISTS `WorkTag`");
                db2.execSQL("DROP TABLE IF EXISTS `SystemIdInfo`");
                db2.execSQL("DROP TABLE IF EXISTS `WorkName`");
                db2.execSQL("DROP TABLE IF EXISTS `WorkProgress`");
                db2.execSQL("DROP TABLE IF EXISTS `Preference`");
                List list2 = ((G) ((WorkDatabase_Impl) this.f8868c)).mCallbacks;
                if (list2 != null) {
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        ((C1268a) it2.next()).getClass();
                        Intrinsics.checkNotNullParameter(db2, "db");
                    }
                }
                break;
            case 2:
                db2.execSQL("DROP TABLE IF EXISTS `request_contacts`");
                List list3 = ((G) ((RequestContactDB_Impl) this.f8868c)).mCallbacks;
                if (list3 != null) {
                    Iterator it3 = list3.iterator();
                    while (it3.hasNext()) {
                        ((C1268a) it3.next()).getClass();
                        Intrinsics.checkNotNullParameter(db2, "db");
                    }
                }
                break;
            case 3:
                db2.execSQL("DROP TABLE IF EXISTS `ad_detail`");
                AdDatabase_Impl adDatabase_Impl = (AdDatabase_Impl) this.f8868c;
                if (((G) adDatabase_Impl).mCallbacks != null) {
                    int size = ((G) adDatabase_Impl).mCallbacks.size();
                    for (int i7 = 0; i7 < size; i7++) {
                        ((C1268a) ((G) adDatabase_Impl).mCallbacks.get(i7)).getClass();
                        Intrinsics.checkNotNullParameter(db2, "db");
                    }
                }
                break;
            default:
                db2.execSQL("DROP TABLE IF EXISTS `events`");
                EventsDatabase_Impl eventsDatabase_Impl = (EventsDatabase_Impl) this.f8868c;
                if (((G) eventsDatabase_Impl).mCallbacks != null) {
                    int size2 = ((G) eventsDatabase_Impl).mCallbacks.size();
                    for (int i10 = 0; i10 < size2; i10++) {
                        ((C1268a) ((G) eventsDatabase_Impl).mCallbacks.get(i10)).getClass();
                        Intrinsics.checkNotNullParameter(db2, "db");
                    }
                }
                break;
        }
    }

    @Override // androidx.room.I
    public final void c(d db2) {
        switch (this.f8867b) {
            case 0:
                List list = ((G) ((BillerSearchRecordDataBase_Impl) this.f8868c)).mCallbacks;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((C1268a) it.next()).getClass();
                        Intrinsics.checkNotNullParameter(db2, "db");
                    }
                }
                break;
            case 1:
                List list2 = ((G) ((WorkDatabase_Impl) this.f8868c)).mCallbacks;
                if (list2 != null) {
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        ((C1268a) it2.next()).getClass();
                        Intrinsics.checkNotNullParameter(db2, "db");
                    }
                }
                break;
            case 2:
                List list3 = ((G) ((RequestContactDB_Impl) this.f8868c)).mCallbacks;
                if (list3 != null) {
                    Iterator it3 = list3.iterator();
                    while (it3.hasNext()) {
                        ((C1268a) it3.next()).getClass();
                        Intrinsics.checkNotNullParameter(db2, "db");
                    }
                }
                break;
            case 3:
                AdDatabase_Impl adDatabase_Impl = (AdDatabase_Impl) this.f8868c;
                if (((G) adDatabase_Impl).mCallbacks != null) {
                    int size = ((G) adDatabase_Impl).mCallbacks.size();
                    for (int i7 = 0; i7 < size; i7++) {
                        ((C1268a) ((G) adDatabase_Impl).mCallbacks.get(i7)).getClass();
                        Intrinsics.checkNotNullParameter(db2, "db");
                    }
                }
                break;
            default:
                EventsDatabase_Impl eventsDatabase_Impl = (EventsDatabase_Impl) this.f8868c;
                if (((G) eventsDatabase_Impl).mCallbacks != null) {
                    int size2 = ((G) eventsDatabase_Impl).mCallbacks.size();
                    for (int i10 = 0; i10 < size2; i10++) {
                        ((C1268a) ((G) eventsDatabase_Impl).mCallbacks.get(i10)).getClass();
                        Intrinsics.checkNotNullParameter(db2, "db");
                    }
                }
                break;
        }
    }

    @Override // androidx.room.I
    public final void d(d dVar) {
        switch (this.f8867b) {
            case 0:
                BillerSearchRecordDataBase_Impl billerSearchRecordDataBase_Impl = (BillerSearchRecordDataBase_Impl) this.f8868c;
                ((G) billerSearchRecordDataBase_Impl).mDatabase = dVar;
                billerSearchRecordDataBase_Impl.internalInitInvalidationTracker(dVar);
                List list = ((G) billerSearchRecordDataBase_Impl).mCallbacks;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((C1268a) it.next()).a(dVar);
                    }
                }
                break;
            case 1:
                WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f8868c;
                ((G) workDatabase_Impl).mDatabase = dVar;
                dVar.execSQL("PRAGMA foreign_keys = ON");
                workDatabase_Impl.internalInitInvalidationTracker(dVar);
                List list2 = ((G) workDatabase_Impl).mCallbacks;
                if (list2 != null) {
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        ((C1268a) it2.next()).a(dVar);
                    }
                }
                break;
            case 2:
                RequestContactDB_Impl requestContactDB_Impl = (RequestContactDB_Impl) this.f8868c;
                ((G) requestContactDB_Impl).mDatabase = dVar;
                requestContactDB_Impl.internalInitInvalidationTracker(dVar);
                List list3 = ((G) requestContactDB_Impl).mCallbacks;
                if (list3 != null) {
                    Iterator it3 = list3.iterator();
                    while (it3.hasNext()) {
                        ((C1268a) it3.next()).a(dVar);
                    }
                }
                break;
            case 3:
                AdDatabase_Impl adDatabase_Impl = (AdDatabase_Impl) this.f8868c;
                ((G) adDatabase_Impl).mDatabase = dVar;
                adDatabase_Impl.internalInitInvalidationTracker(dVar);
                if (((G) adDatabase_Impl).mCallbacks != null) {
                    int size = ((G) adDatabase_Impl).mCallbacks.size();
                    for (int i7 = 0; i7 < size; i7++) {
                        ((C1268a) ((G) adDatabase_Impl).mCallbacks.get(i7)).a(dVar);
                    }
                }
                break;
            default:
                EventsDatabase_Impl eventsDatabase_Impl = (EventsDatabase_Impl) this.f8868c;
                ((G) eventsDatabase_Impl).mDatabase = dVar;
                eventsDatabase_Impl.internalInitInvalidationTracker(dVar);
                if (((G) eventsDatabase_Impl).mCallbacks != null) {
                    int size2 = ((G) eventsDatabase_Impl).mCallbacks.size();
                    for (int i10 = 0; i10 < size2; i10++) {
                        ((C1268a) ((G) eventsDatabase_Impl).mCallbacks.get(i10)).a(dVar);
                    }
                }
                break;
        }
    }

    @Override // androidx.room.I
    public final void e(d dVar) throws IOException {
        switch (this.f8867b) {
            case 0:
                com.facebook.imagepipeline.nativecode.b.l(dVar);
                break;
            case 1:
                com.facebook.imagepipeline.nativecode.b.l(dVar);
                break;
            case 2:
                com.facebook.imagepipeline.nativecode.b.l(dVar);
                break;
            case 3:
                com.facebook.imagepipeline.nativecode.b.l(dVar);
                break;
            default:
                com.facebook.imagepipeline.nativecode.b.l(dVar);
                break;
        }
    }

    @Override // androidx.room.I
    public final N f(d dVar) throws IOException {
        switch (this.f8867b) {
            case 0:
                HashMap map = new HashMap(4);
                map.put("recordId", new K0.b("recordId", "INTEGER", null, 1, 1, true));
                map.put("memberId", new K0.b("memberId", "TEXT", null, 0, 1, false));
                map.put("searchText", new K0.b("searchText", "TEXT", null, 0, 1, false));
                map.put("updateTime", new K0.b("updateTime", "INTEGER", null, 0, 1, true));
                h hVar = new h("biller_search_record", map, new HashSet(0), new HashSet(0));
                h hVar2 = h.f4893e.read(dVar, "biller_search_record");
                if (hVar.equals(hVar2)) {
                    return new N(true, null, 3);
                }
                return new N(false, "biller_search_record(com.transsnet.palmpay.teller.db.entity.BillerSearchRecord).\n Expected:\n" + hVar + "\n Found:\n" + hVar2, 3);
            case 1:
                HashMap map2 = new HashMap(2);
                map2.put("work_spec_id", new K0.b("work_spec_id", "TEXT", null, 1, 1, true));
                map2.put("prerequisite_id", new K0.b("prerequisite_id", "TEXT", null, 2, 1, true));
                HashSet hashSet = new HashSet(2);
                hashSet.add(new K0.d("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
                hashSet.add(new K0.d("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("prerequisite_id"), Arrays.asList("id")));
                HashSet hashSet2 = new HashSet(2);
                hashSet2.add(new g("index_Dependency_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
                hashSet2.add(new g("index_Dependency_prerequisite_id", false, Arrays.asList("prerequisite_id"), Arrays.asList("ASC")));
                h hVar3 = new h("Dependency", map2, hashSet, hashSet2);
                c cVar = h.f4893e;
                h hVar4 = cVar.read(dVar, "Dependency");
                if (!hVar3.equals(hVar4)) {
                    return new N(false, "Dependency(androidx.work.impl.model.Dependency).\n Expected:\n" + hVar3 + "\n Found:\n" + hVar4, 3);
                }
                HashMap map3 = new HashMap(32);
                map3.put("id", new K0.b("id", "TEXT", null, 1, 1, true));
                map3.put(RemoteConfigConstants.ResponseFieldKey.STATE, new K0.b(RemoteConfigConstants.ResponseFieldKey.STATE, "INTEGER", null, 0, 1, true));
                map3.put("worker_class_name", new K0.b("worker_class_name", "TEXT", null, 0, 1, true));
                map3.put("input_merger_class_name", new K0.b("input_merger_class_name", "TEXT", null, 0, 1, true));
                map3.put("input", new K0.b("input", "BLOB", null, 0, 1, true));
                map3.put("output", new K0.b("output", "BLOB", null, 0, 1, true));
                map3.put("initial_delay", new K0.b("initial_delay", "INTEGER", null, 0, 1, true));
                map3.put("interval_duration", new K0.b("interval_duration", "INTEGER", null, 0, 1, true));
                map3.put("flex_duration", new K0.b("flex_duration", "INTEGER", null, 0, 1, true));
                map3.put("run_attempt_count", new K0.b("run_attempt_count", "INTEGER", null, 0, 1, true));
                map3.put("backoff_policy", new K0.b("backoff_policy", "INTEGER", null, 0, 1, true));
                map3.put("backoff_delay_duration", new K0.b("backoff_delay_duration", "INTEGER", null, 0, 1, true));
                map3.put("last_enqueue_time", new K0.b("last_enqueue_time", "INTEGER", FlexiOneClickOpenReq.Device.DEFAULT_STRING_VALUE, 0, 1, true));
                map3.put("minimum_retention_duration", new K0.b("minimum_retention_duration", "INTEGER", null, 0, 1, true));
                map3.put("schedule_requested_at", new K0.b("schedule_requested_at", "INTEGER", null, 0, 1, true));
                map3.put("run_in_foreground", new K0.b("run_in_foreground", "INTEGER", null, 0, 1, true));
                map3.put("out_of_quota_policy", new K0.b("out_of_quota_policy", "INTEGER", null, 0, 1, true));
                map3.put("period_count", new K0.b("period_count", "INTEGER", "0", 0, 1, true));
                map3.put("generation", new K0.b("generation", "INTEGER", "0", 0, 1, true));
                map3.put("next_schedule_time_override", new K0.b("next_schedule_time_override", "INTEGER", "9223372036854775807", 0, 1, true));
                map3.put("next_schedule_time_override_generation", new K0.b("next_schedule_time_override_generation", "INTEGER", "0", 0, 1, true));
                map3.put("stop_reason", new K0.b("stop_reason", "INTEGER", "-256", 0, 1, true));
                map3.put("trace_tag", new K0.b("trace_tag", "TEXT", null, 0, 1, false));
                map3.put("required_network_type", new K0.b("required_network_type", "INTEGER", null, 0, 1, true));
                map3.put("required_network_request", new K0.b("required_network_request", "BLOB", "x''", 0, 1, true));
                map3.put("requires_charging", new K0.b("requires_charging", "INTEGER", null, 0, 1, true));
                map3.put("requires_device_idle", new K0.b("requires_device_idle", "INTEGER", null, 0, 1, true));
                map3.put("requires_battery_not_low", new K0.b("requires_battery_not_low", "INTEGER", null, 0, 1, true));
                map3.put("requires_storage_not_low", new K0.b("requires_storage_not_low", "INTEGER", null, 0, 1, true));
                map3.put("trigger_content_update_delay", new K0.b("trigger_content_update_delay", "INTEGER", null, 0, 1, true));
                map3.put("trigger_max_content_delay", new K0.b("trigger_max_content_delay", "INTEGER", null, 0, 1, true));
                map3.put("content_uri_triggers", new K0.b("content_uri_triggers", "BLOB", null, 0, 1, true));
                HashSet hashSet3 = new HashSet(0);
                HashSet hashSet4 = new HashSet(2);
                hashSet4.add(new g("index_WorkSpec_schedule_requested_at", false, Arrays.asList("schedule_requested_at"), Arrays.asList("ASC")));
                hashSet4.add(new g("index_WorkSpec_last_enqueue_time", false, Arrays.asList("last_enqueue_time"), Arrays.asList("ASC")));
                h hVar5 = new h("WorkSpec", map3, hashSet3, hashSet4);
                h hVar6 = cVar.read(dVar, "WorkSpec");
                if (!hVar5.equals(hVar6)) {
                    return new N(false, "WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n" + hVar5 + "\n Found:\n" + hVar6, 3);
                }
                HashMap map4 = new HashMap(2);
                map4.put("tag", new K0.b("tag", "TEXT", null, 1, 1, true));
                map4.put("work_spec_id", new K0.b("work_spec_id", "TEXT", null, 2, 1, true));
                HashSet hashSet5 = new HashSet(1);
                hashSet5.add(new K0.d("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
                HashSet hashSet6 = new HashSet(1);
                hashSet6.add(new g("index_WorkTag_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
                h hVar7 = new h("WorkTag", map4, hashSet5, hashSet6);
                h hVar8 = cVar.read(dVar, "WorkTag");
                if (!hVar7.equals(hVar8)) {
                    return new N(false, "WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n" + hVar7 + "\n Found:\n" + hVar8, 3);
                }
                HashMap map5 = new HashMap(3);
                map5.put("work_spec_id", new K0.b("work_spec_id", "TEXT", null, 1, 1, true));
                map5.put("generation", new K0.b("generation", "INTEGER", "0", 2, 1, true));
                map5.put("system_id", new K0.b("system_id", "INTEGER", null, 0, 1, true));
                HashSet hashSet7 = new HashSet(1);
                hashSet7.add(new K0.d("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
                h hVar9 = new h("SystemIdInfo", map5, hashSet7, new HashSet(0));
                h hVar10 = cVar.read(dVar, "SystemIdInfo");
                if (!hVar9.equals(hVar10)) {
                    return new N(false, "SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n" + hVar9 + "\n Found:\n" + hVar10, 3);
                }
                HashMap map6 = new HashMap(2);
                map6.put("name", new K0.b("name", "TEXT", null, 1, 1, true));
                map6.put("work_spec_id", new K0.b("work_spec_id", "TEXT", null, 2, 1, true));
                HashSet hashSet8 = new HashSet(1);
                hashSet8.add(new K0.d("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
                HashSet hashSet9 = new HashSet(1);
                hashSet9.add(new g("index_WorkName_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
                h hVar11 = new h("WorkName", map6, hashSet8, hashSet9);
                h hVar12 = cVar.read(dVar, "WorkName");
                if (!hVar11.equals(hVar12)) {
                    return new N(false, "WorkName(androidx.work.impl.model.WorkName).\n Expected:\n" + hVar11 + "\n Found:\n" + hVar12, 3);
                }
                HashMap map7 = new HashMap(2);
                map7.put("work_spec_id", new K0.b("work_spec_id", "TEXT", null, 1, 1, true));
                map7.put(ReactProgressBarViewManager.PROP_PROGRESS, new K0.b(ReactProgressBarViewManager.PROP_PROGRESS, "BLOB", null, 0, 1, true));
                HashSet hashSet10 = new HashSet(1);
                hashSet10.add(new K0.d("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
                h hVar13 = new h("WorkProgress", map7, hashSet10, new HashSet(0));
                h hVar14 = cVar.read(dVar, "WorkProgress");
                if (!hVar13.equals(hVar14)) {
                    return new N(false, "WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n" + hVar13 + "\n Found:\n" + hVar14, 3);
                }
                HashMap map8 = new HashMap(2);
                map8.put("key", new K0.b("key", "TEXT", null, 1, 1, true));
                map8.put("long_value", new K0.b("long_value", "INTEGER", null, 0, 1, false));
                h hVar15 = new h("Preference", map8, new HashSet(0), new HashSet(0));
                h hVar16 = cVar.read(dVar, "Preference");
                if (hVar15.equals(hVar16)) {
                    return new N(true, null, 3);
                }
                return new N(false, "Preference(androidx.work.impl.model.Preference).\n Expected:\n" + hVar15 + "\n Found:\n" + hVar16, 3);
            case 2:
                HashMap map9 = new HashMap(12);
                map9.put("contact_member_id", new K0.b("contact_member_id", "TEXT", null, 1, 1, true));
                map9.put("alias", new K0.b("alias", "TEXT", null, 0, 1, false));
                map9.put("full_name", new K0.b("full_name", "TEXT", null, 0, 1, false));
                map9.put("is_favourite", new K0.b("is_favourite", "TEXT", null, 0, 1, false));
                map9.put("is_friend", new K0.b("is_friend", "INTEGER", null, 0, 1, true));
                map9.put("phone", new K0.b("phone", "TEXT", null, 0, 1, false));
                map9.put("photo_path", new K0.b("photo_path", "TEXT", null, 0, 1, false));
                map9.put("request_source", new K0.b("request_source", "TEXT", null, 0, 1, false));
                map9.put("create_time", new K0.b("create_time", "INTEGER", null, 0, 1, true));
                map9.put("update_time", new K0.b("update_time", "INTEGER", null, 0, 1, true));
                map9.put("expire_time", new K0.b("expire_time", "INTEGER", null, 0, 1, true));
                map9.put("own_member_id", new K0.b("own_member_id", "TEXT", null, 2, 1, true));
                h hVar17 = new h("request_contacts", map9, new HashSet(0), new HashSet(0));
                h hVar18 = h.f4893e.read(dVar, "request_contacts");
                if (hVar17.equals(hVar18)) {
                    return new N(true, null, 3);
                }
                return new N(false, "request_contacts(com.transsnet.palmpay.core.db.entity.RequestContact).\n Expected:\n" + hVar17 + "\n Found:\n" + hVar18, 3);
            case 3:
                return g(dVar);
            default:
                HashMap map10 = new HashMap(4);
                map10.put("id", new K0.b("id", "INTEGER", null, 1, 1, true));
                map10.put(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, new K0.b(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "TEXT", null, 0, 1, false));
                map10.put("create_time", new K0.b("create_time", "INTEGER", null, 0, 1, true));
                map10.put("type", new K0.b("type", "INTEGER", null, 0, 1, true));
                h hVar19 = new h("events", map10, new HashSet(0), new HashSet(0));
                h hVar20 = h.f4893e.read(dVar, "events");
                if (hVar19.equals(hVar20)) {
                    return new N(true, null, 3);
                }
                return new N(false, "events(com.transsnet.analysis.data.local.entity.EventsEntity).\n Expected:\n" + hVar19 + "\n Found:\n" + hVar20, 3);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(AdDatabase_Impl adDatabase_Impl) {
        super(17);
        this.f8867b = 3;
        this.f8868c = adDatabase_Impl;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(EventsDatabase_Impl eventsDatabase_Impl) {
        super(2);
        this.f8867b = 4;
        this.f8868c = eventsDatabase_Impl;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(WorkDatabase_Impl workDatabase_Impl) {
        super(23);
        this.f8867b = 1;
        this.f8868c = workDatabase_Impl;
    }
}
