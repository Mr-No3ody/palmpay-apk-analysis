package com.yalantis.ucrop;

import N8.q0;
import android.annotation.TargetApi;
import android.content.Intent;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AbstractActivityC0837o;
import androidx.appcompat.app.AbstractC0824b;
import androidx.appcompat.app.AbstractC0841t;
import androidx.appcompat.app.r;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.n1;
import androidx.core.graphics.b;
import androidx.core.graphics.o;
import androidx.fragment.app.C1161a;
import androidx.fragment.app.Z;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.didiglobal.booster.instrument.ShadowToast;
import com.yalantis.ucrop.decoration.GridSpacingItemDecoration;
import com.yalantis.ucrop.model.AspectRatio;
import com.yalantis.ucrop.statusbar.ImmersiveManager;
import com.yalantis.ucrop.util.DensityUtil;
import com.yalantis.ucrop.util.FileUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import p264r5.a;

/* JADX INFO: loaded from: classes4.dex */
public class UCropMultipleActivity extends AbstractActivityC0837o implements UCropFragmentCallback {
    private ArrayList<AspectRatio> aspectRatioList;
    private int currentFragmentPosition;
    private UCropGalleryAdapter galleryAdapter;
    private boolean isForbidCropGifWebp;
    private boolean isSkipCropForbid;
    private boolean mShowLoader;
    private int mStatusBarColor;

    @DrawableRes
    private int mToolbarCancelDrawable;
    private int mToolbarColor;

    @DrawableRes
    private int mToolbarCropDrawable;
    private String mToolbarTitle;
    private int mToolbarTitleSize;
    private int mToolbarWidgetColor;
    private String outputCropFileName;
    private UCropFragment uCropCurrentFragment;
    private ArrayList<String> uCropNotSupportList;
    private ArrayList<String> uCropSupportList;
    private final List<UCropFragment> fragments = new ArrayList();
    private final LinkedHashMap<String, JSONObject> uCropTotalQueue = new LinkedHashMap<>();
    private final HashSet<String> filterSet = new HashSet<>();

    static {
        r rVar = AbstractC0841t.f12314a;
        int i7 = n1.f12981a;
    }

    private int getCropSupportPosition() {
        ArrayList<String> stringArrayList;
        Bundle extras = getIntent().getExtras();
        if (extras != null && (stringArrayList = extras.getStringArrayList(UCrop.Options.EXTRA_SKIP_CROP_MIME_TYPE)) != null && stringArrayList.size() > 0) {
            this.filterSet.addAll(stringArrayList);
            int i7 = -1;
            for (int i10 = 0; i10 < this.uCropSupportList.size(); i10++) {
                i7++;
                if (!this.filterSet.contains(getPathToMimeType(this.uCropSupportList.get(i10)))) {
                    break;
                }
            }
            if (i7 != -1 && i7 <= this.fragments.size()) {
                return i7;
            }
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getPathToMimeType(String str) {
        return FileUtils.isContent(str) ? FileUtils.getMimeTypeFromMediaContentUri(this, Uri.parse(str)) : FileUtils.getMimeTypeFromMediaContentUri(this, Uri.fromFile(new File(str)));
    }

    private String getSandboxPathDir() {
        String stringExtra = getIntent().getStringExtra(UCrop.Options.EXTRA_CROP_OUTPUT_DIR);
        File file = (stringExtra == null || "".equals(stringExtra)) ? new File(getExternalFilesDir(Environment.DIRECTORY_PICTURES).getAbsolutePath(), "Sandbox") : new File(stringExtra);
        if (!file.exists()) {
            file.mkdirs();
        }
        return file.getAbsolutePath() + File.separator;
    }

    private void handleCropError(@NonNull Intent intent) {
        Throwable error = UCrop.getError(intent);
        if (error != null) {
            ShadowToast.show(Toast.makeText(this, error.getMessage(), 1));
        } else {
            ShadowToast.show(Toast.makeText(this, "Unexpected error", 0));
        }
    }

    private void immersive() {
        Intent intent = getIntent();
        boolean booleanExtra = intent.getBooleanExtra(UCrop.Options.EXTRA_DARK_STATUS_BAR_BLACK, false);
        int intExtra = intent.getIntExtra(UCrop.Options.EXTRA_STATUS_BAR_COLOR, getColor(R.color.ucrop_color_statusbar));
        this.mStatusBarColor = intExtra;
        ImmersiveManager.immersiveAboveAPI23(this, intExtra, intExtra, booleanExtra);
    }

    private void initCropFragments(Intent intent) {
        String string;
        int i7 = 0;
        this.isSkipCropForbid = intent.getBooleanExtra(UCrop.Options.EXTRA_CROP_FORBID_SKIP, false);
        ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra(UCrop.EXTRA_CROP_TOTAL_DATA_SOURCE);
        if (stringArrayListExtra == null || stringArrayListExtra.size() <= 0) {
            throw new IllegalArgumentException("Missing required parameters, count cannot be less than 1");
        }
        this.uCropSupportList = new ArrayList<>();
        this.uCropNotSupportList = new ArrayList<>();
        while (i7 < stringArrayListExtra.size()) {
            String str = stringArrayListExtra.get(i7);
            this.uCropTotalQueue.put(str, new JSONObject());
            String path = FileUtils.isContent(str) ? FileUtils.getPath(this, Uri.parse(str)) : str;
            String pathToMimeType = getPathToMimeType(str);
            if (FileUtils.isUrlHasVideo(path) || FileUtils.isHasVideo(pathToMimeType) || FileUtils.isHasAudio(pathToMimeType)) {
                this.uCropNotSupportList.add(str);
            } else {
                this.uCropSupportList.add(str);
                Bundle extras = intent.getExtras();
                if (extras != null) {
                    Uri uriFromFile = (FileUtils.isContent(str) || FileUtils.isHasHttp(str)) ? Uri.parse(str) : Uri.fromFile(new File(str));
                    String postfixDefaultJPEG = FileUtils.getPostfixDefaultJPEG(this, this.isForbidCropGifWebp, uriFromFile);
                    if (TextUtils.isEmpty(this.outputCropFileName)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(FileUtils.getCreateFileName("CROP_" + (i7 + 1)));
                        sb2.append(postfixDefaultJPEG);
                        string = sb2.toString();
                    } else {
                        string = (i7 + 1) + FileUtils.getCreateFileName() + "_" + this.outputCropFileName;
                    }
                    Uri uriFromFile2 = Uri.fromFile(new File(getSandboxPathDir(), string));
                    extras.putParcelable(UCrop.EXTRA_INPUT_URI, uriFromFile);
                    extras.putParcelable("com.yalantis.ucrop.OutputUri", uriFromFile2);
                    ArrayList<AspectRatio> arrayList = this.aspectRatioList;
                    AspectRatio aspectRatio = (arrayList == null || arrayList.size() <= i7) ? null : this.aspectRatioList.get(i7);
                    extras.putFloat(UCrop.EXTRA_ASPECT_RATIO_X, aspectRatio != null ? aspectRatio.getAspectRatioX() : -1.0f);
                    extras.putFloat(UCrop.EXTRA_ASPECT_RATIO_Y, aspectRatio != null ? aspectRatio.getAspectRatioY() : -1.0f);
                    this.fragments.add(UCropFragment.newInstance(extras));
                }
            }
            i7++;
        }
        if (this.uCropSupportList.size() == 0) {
            throw new IllegalArgumentException("No clipping data sources are available");
        }
        setGalleryAdapter();
        switchCropFragment(this.fragments.get(getCropSupportPosition()), getCropSupportPosition());
        this.galleryAdapter.setCurrentSelectPosition(getCropSupportPosition());
    }

    private void mergeCropResult(Intent intent) {
        try {
            String stringExtra = intent.getStringExtra(UCrop.EXTRA_CROP_INPUT_ORIGINAL);
            JSONObject jSONObject = this.uCropTotalQueue.get(stringExtra);
            Uri output = UCrop.getOutput(intent);
            jSONObject.put("outPutPath", output != null ? output.getPath() : "");
            jSONObject.put("imageWidth", UCrop.getOutputImageWidth(intent));
            jSONObject.put("imageHeight", UCrop.getOutputImageHeight(intent));
            jSONObject.put("offsetX", UCrop.getOutputImageOffsetX(intent));
            jSONObject.put("offsetY", UCrop.getOutputImageOffsetY(intent));
            jSONObject.put("aspectRatio", UCrop.getOutputCropAspectRatio(intent));
            this.uCropTotalQueue.put(stringExtra, jSONObject);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private void onCropCompleteFinish() {
        JSONArray jSONArray = new JSONArray();
        Iterator<Map.Entry<String, JSONObject>> it = this.uCropTotalQueue.entrySet().iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next().getValue());
        }
        Intent intent = new Intent();
        intent.putExtra("output", jSONArray.toString());
        setResult(-1, intent);
        finish();
    }

    private void setGalleryAdapter() {
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_gallery);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(0);
        recyclerView.setLayoutManager(linearLayoutManager);
        if (recyclerView.getItemDecorationCount() == 0) {
            recyclerView.addItemDecoration(new GridSpacingItemDecoration(Integer.MAX_VALUE, DensityUtil.dip2px(this, 6.0f), true));
        }
        recyclerView.setLayoutAnimation(AnimationUtils.loadLayoutAnimation(this, R.anim.ucrop_layout_animation_fall_down));
        recyclerView.setBackgroundResource(getIntent().getIntExtra(UCrop.Options.EXTRA_GALLERY_BAR_BACKGROUND, R.drawable.ucrop_gallery_bg));
        UCropGalleryAdapter uCropGalleryAdapter = new UCropGalleryAdapter(this.uCropSupportList);
        this.galleryAdapter = uCropGalleryAdapter;
        uCropGalleryAdapter.setOnItemClickListener(new UCropGalleryAdapter.OnItemClickListener() { // from class: com.yalantis.ucrop.UCropMultipleActivity.1
            @Override // com.yalantis.ucrop.UCropGalleryAdapter.OnItemClickListener
            public void onItemClick(int i7, View view) {
                if (UCropMultipleActivity.this.isSkipCropForbid) {
                    return;
                }
                if (UCropMultipleActivity.this.filterSet.contains(UCropMultipleActivity.this.getPathToMimeType((String) UCropMultipleActivity.this.uCropSupportList.get(i7)))) {
                    ShadowToast.show(Toast.makeText(UCropMultipleActivity.this.getApplicationContext(), UCropMultipleActivity.this.getString(R.string.ucrop_not_crop), 0));
                    return;
                }
                if (UCropMultipleActivity.this.galleryAdapter.getCurrentSelectPosition() == i7) {
                    return;
                }
                UCropMultipleActivity.this.galleryAdapter.notifyItemChanged(UCropMultipleActivity.this.galleryAdapter.getCurrentSelectPosition());
                UCropMultipleActivity.this.galleryAdapter.setCurrentSelectPosition(i7);
                UCropMultipleActivity.this.galleryAdapter.notifyItemChanged(i7);
                UCropMultipleActivity.this.switchCropFragment((UCropFragment) UCropMultipleActivity.this.fragments.get(i7), i7);
            }
        });
        recyclerView.setAdapter(this.galleryAdapter);
    }

    @TargetApi(21)
    private void setStatusBarColor(@ColorInt int i7) {
        Window window = getWindow();
        if (window != null) {
            window.addFlags(Integer.MIN_VALUE);
            window.setStatusBarColor(i7);
        }
    }

    private void setupAppBar() {
        setStatusBarColor(this.mStatusBarColor);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setBackgroundColor(this.mToolbarColor);
        toolbar.setTitleTextColor(this.mToolbarWidgetColor);
        TextView textView = (TextView) toolbar.findViewById(R.id.toolbar_title);
        textView.setTextColor(this.mToolbarWidgetColor);
        textView.setText(this.mToolbarTitle);
        textView.setTextSize(this.mToolbarTitleSize);
        Drawable drawableMutate = a.q(this.mToolbarCancelDrawable, this).mutate();
        drawableMutate.setColorFilter(o.e(this.mToolbarWidgetColor, b.SRC_ATOP));
        toolbar.setNavigationIcon(drawableMutate);
        setSupportActionBar(toolbar);
        AbstractC0824b supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.q();
        }
    }

    private void setupViews(@NonNull Intent intent) {
        this.aspectRatioList = getIntent().getParcelableArrayListExtra(UCrop.Options.EXTRA_MULTIPLE_ASPECT_RATIO);
        this.isForbidCropGifWebp = intent.getBooleanExtra(UCrop.Options.EXTRA_CROP_FORBID_GIF_WEBP, false);
        this.outputCropFileName = intent.getStringExtra(UCrop.Options.EXTRA_CROP_OUTPUT_FILE_NAME);
        this.mStatusBarColor = intent.getIntExtra(UCrop.Options.EXTRA_STATUS_BAR_COLOR, getColor(R.color.ucrop_color_statusbar));
        this.mToolbarColor = intent.getIntExtra(UCrop.Options.EXTRA_TOOL_BAR_COLOR, getColor(R.color.ucrop_color_toolbar));
        this.mToolbarWidgetColor = intent.getIntExtra(UCrop.Options.EXTRA_UCROP_WIDGET_COLOR_TOOLBAR, getColor(R.color.ucrop_color_toolbar_widget));
        this.mToolbarCancelDrawable = intent.getIntExtra(UCrop.Options.EXTRA_UCROP_WIDGET_CANCEL_DRAWABLE, R.drawable.ucrop_ic_cross);
        this.mToolbarCropDrawable = intent.getIntExtra(UCrop.Options.EXTRA_UCROP_WIDGET_CROP_DRAWABLE, R.drawable.ucrop_ic_done);
        this.mToolbarTitle = intent.getStringExtra(UCrop.Options.EXTRA_UCROP_TITLE_TEXT_TOOLBAR);
        this.mToolbarTitleSize = intent.getIntExtra(UCrop.Options.EXTRA_UCROP_TITLE_TEXT_SIZE_TOOLBAR, 18);
        String string = this.mToolbarTitle;
        if (string == null) {
            string = getResources().getString(R.string.ucrop_label_edit_photo);
        }
        this.mToolbarTitle = string;
        setupAppBar();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void switchCropFragment(UCropFragment uCropFragment, int i7) {
        Z supportFragmentManager = getSupportFragmentManager();
        C1161a c1161aE = q0.e(supportFragmentManager, supportFragmentManager);
        if (uCropFragment.isAdded()) {
            c1161aE.l(this.uCropCurrentFragment);
            c1161aE.p(uCropFragment);
            uCropFragment.fragmentReVisible();
        } else {
            UCropFragment uCropFragment2 = this.uCropCurrentFragment;
            if (uCropFragment2 != null) {
                c1161aE.l(uCropFragment2);
            }
            c1161aE.d(R.id.fragment_container, uCropFragment, UCropFragment.TAG + "-" + i7, 1);
        }
        this.currentFragmentPosition = i7;
        this.uCropCurrentFragment = uCropFragment;
        c1161aE.h(true);
    }

    @Override // com.yalantis.ucrop.UCropFragmentCallback
    public void loadingProgress(boolean z3) {
        this.mShowLoader = z3;
        supportInvalidateOptionsMenu();
    }

    @Override // androidx.fragment.app.E, androidx.activity.AbstractActivityC0822m, androidx.core.app.AbstractActivityC1040i, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        immersive();
        setContentView(R.layout.ucrop_activity_multiple);
        setupViews(getIntent());
        initCropFragments(getIntent());
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.ucrop_menu_activity, menu);
        MenuItem menuItemFindItem = menu.findItem(R.id.menu_loader);
        Drawable icon = menuItemFindItem.getIcon();
        if (icon != null) {
            try {
                icon.mutate();
                icon.setColorFilter(o.e(this.mToolbarWidgetColor, b.SRC_ATOP));
                menuItemFindItem.setIcon(icon);
            } catch (IllegalStateException e10) {
                e10.printStackTrace();
            }
            ((Animatable) menuItemFindItem.getIcon()).start();
        }
        MenuItem menuItemFindItem2 = menu.findItem(R.id.menu_crop);
        Drawable drawable = getDrawable(this.mToolbarCropDrawable);
        if (drawable == null) {
            return true;
        }
        drawable.mutate();
        drawable.setColorFilter(o.e(this.mToolbarWidgetColor, b.SRC_ATOP));
        menuItemFindItem2.setIcon(drawable);
        return true;
    }

    @Override // com.yalantis.ucrop.UCropFragmentCallback
    public void onCropFinish(UCropFragment.UCropResult uCropResult) {
        int i7 = uCropResult.mResultCode;
        if (i7 != -1) {
            if (i7 != 96) {
                return;
            }
            handleCropError(uCropResult.mResultData);
            return;
        }
        int size = this.uCropNotSupportList.size() + this.currentFragmentPosition;
        int size2 = (this.uCropSupportList.size() + this.uCropNotSupportList.size()) - 1;
        mergeCropResult(uCropResult.mResultData);
        if (size == size2) {
            onCropCompleteFinish();
            return;
        }
        int i10 = this.currentFragmentPosition + 1;
        String pathToMimeType = getPathToMimeType(this.uCropSupportList.get(i10));
        while (this.filterSet.contains(pathToMimeType)) {
            if (i10 == size2) {
                onCropCompleteFinish();
                return;
            } else {
                i10++;
                pathToMimeType = getPathToMimeType(this.uCropSupportList.get(i10));
            }
        }
        switchCropFragment(this.fragments.get(i10), i10);
        UCropGalleryAdapter uCropGalleryAdapter = this.galleryAdapter;
        uCropGalleryAdapter.notifyItemChanged(uCropGalleryAdapter.getCurrentSelectPosition());
        this.galleryAdapter.setCurrentSelectPosition(i10);
        UCropGalleryAdapter uCropGalleryAdapter2 = this.galleryAdapter;
        uCropGalleryAdapter2.notifyItemChanged(uCropGalleryAdapter2.getCurrentSelectPosition());
    }

    @Override // androidx.appcompat.app.AbstractActivityC0837o, androidx.fragment.app.E, android.app.Activity
    public void onDestroy() {
        UCropDevelopConfig.destroy();
        super.onDestroy();
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == R.id.menu_crop) {
            UCropFragment uCropFragment = this.uCropCurrentFragment;
            if (uCropFragment != null && uCropFragment.isAdded()) {
                this.uCropCurrentFragment.cropAndSaveImage();
            }
        } else if (menuItem.getItemId() == 16908332) {
            onBackPressed();
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // android.app.Activity
    public boolean onPrepareOptionsMenu(Menu menu) {
        menu.findItem(R.id.menu_crop).setVisible(!this.mShowLoader);
        menu.findItem(R.id.menu_loader).setVisible(this.mShowLoader);
        return super.onPrepareOptionsMenu(menu);
    }
}
