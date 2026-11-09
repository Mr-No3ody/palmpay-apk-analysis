package H;

import C0.G;
import androidx.camera.camera2.internal.F;
import androidx.camera.core.processing.ShaderProvider;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class e implements ShaderProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3512a;

    public /* synthetic */ e(int i7) {
        this.f3512a = i7;
    }

    @Override // androidx.camera.core.processing.ShaderProvider
    public final String createFragmentShader(String str, String str2) {
        switch (this.f3512a) {
            case 0:
                Locale locale = Locale.US;
                return G.s(F.f("#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 ", str2, ";\nuniform samplerExternalOES ", str, ";\nuniform float uAlphaScale;\nvoid main() {\n    vec4 src = texture2D("), str, ", ", str2, ");\n    gl_FragColor = vec4(src.rgb, src.a * uAlphaScale);\n}\n");
            case 1:
                Locale locale2 = Locale.US;
                return G.s(F.f("#version 300 es\n#extension GL_OES_EGL_image_external_essl3 : require\nprecision mediump float;\nuniform samplerExternalOES ", str, ";\nuniform float uAlphaScale;\nin vec2 ", str2, ";\nout vec4 outColor;\n\nvoid main() {\n  vec4 src = texture("), str, ", ", str2, ");\n  outColor = vec4(src.rgb, src.a * uAlphaScale);\n}");
            default:
                Locale locale3 = Locale.US;
                return G.s(F.f("#version 300 es\n#extension GL_EXT_YUV_target : require\nprecision mediump float;\nuniform __samplerExternal2DY2YEXT ", str, ";\nuniform float uAlphaScale;\nin vec2 ", str2, ";\nout vec4 outColor;\n\nvec3 yuvToRgb(vec3 yuv) {\n  const vec3 yuvOffset = vec3(0.0625, 0.5, 0.5);\n  const mat3 yuvToRgbColorMat = mat3(\n    1.1689f, 1.1689f, 1.1689f,\n    0.0000f, -0.1881f, 2.1502f,\n    1.6853f, -0.6530f, 0.0000f\n  );\n  return clamp(yuvToRgbColorMat * (yuv - yuvOffset), 0.0, 1.0);\n}\n\nvoid main() {\n  vec3 srcYuv = texture("), str, ", ", str2, ").xyz;\n  vec3 srcRgb = yuvToRgb(srcYuv);\n  outColor = vec4(srcRgb, uAlphaScale);\n}");
        }
    }
}
