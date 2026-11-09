package com.palmpay.lib.ui.calendar;

import android.content.Context;
import com.google.android.gms.auth.api.phone.SmsRetrieverStatusCodes;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

/* JADX INFO: loaded from: classes3.dex */
public abstract class s {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static String[] f24317c;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static String[] f24335v;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f24315a = {1887, 5780, 5802, 19157, 2742, 50359, 1198, 2646, 46378, 7466, 3412, 30122, 5482, 67949, 2396, 5294, 43597, 6732, 6954, 36181, 2772, 4954, 18781, 2396, 54427, 5274, 6730, 47781, 5800, 6868, 21210, 4790, 59703, 2350, 5270, 46667, 3402, 3496, 38325, 1388, 4782, 18735, 2350, 52374, 6804, 7498, 44457, 2906, 1388, 29294, 4700, 63789, 6442, 6804, 56138, 5802, 2772, 38235, 1210, 4698, 22827, 5418, 63125, 3476, 5802, 43701, 2484, 5302, 27223, 2646, 70954, 7466, 3412, 54698, 5482, 2412, 38062, 5294, 2636, 32038, 6954, 60245, 2772, 4826, 43357, 2394, 5274, 39501, 6730, 72357, 5800, 5844, 53978, 4790, 2358, 38039, 5270, 87627, 3402, 3496, 54708, 5484, 4782, 43311, 2350, 3222, 27978, 7498, 68965, 2904, 5484, 45677, 4700, 6444, 39573, 6804, 6986, 19285, 2772, 62811, 1210, 4698, 47403, 5418, 5780, 38570, 5546, 76469, 2420, 5302, 51799, 2646, 5414, SmsRetrieverStatusCodes.API_NOT_AVAILABLE, 3412, 5546, 18869, 2412, 54446, 5276, 6732, 48422, 6822, 2900, 28010, 4826, 92509, 2394, 5274, 55883, 6730, 6820, 47956, 5812, 2778, 18779, 2358, 62615, 5270, 5450, 46757, 3492, 5556, 27318, 4718, 67887, 2350, 3222, 52554, 7498, 3428, 38252, 5468, 4700, 31022, 6444, 64149, 6804, 6986, 43861, 2772, 5338, 35421, 2650, 70955, 5418, 5780, 54954, 5546, 2740, 38074, 5302, 2646, 29991, 3366, 61011, 3412, 5546, 43445, 2412, 5294, 35406, 6732, 72998, 6820, 6996, 52586, 2778, 2396, 38045, 5274, 6698, 23333, 6820, 64338, 5812, 2746, 43355, 2358, 5270, 39499, 5450, 79525, 3492, 5548};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f24316b = {1887, 966732, 967231, 967733, 968265, 968766, 969297, 969798, 970298, 970829, 971330, 971830, 972362, 972863, 973395, 973896, 974397, 974928, 975428, 975929, 976461, 976962, 977462, 977994, 978494, 979026, 979526, 980026, 980558, 981059, 981559, 982091, 982593, 983124, 983624, 984124, 984656, 985157, 985656, 986189, 986690, 987191, 987722, 988222, 988753, 989254, 989754, 990286, 990788, 991288, 991819, 992319, 992851, 993352, 993851, 994383, 994885, 995385, 995917, 996418, 996918, 997450, 997949, 998481, 998982, 999483, 1000014, 1000515, 1001016, 1001548, 1002047, 1002578, 1003080, 1003580, 1004111, 1004613, 1005113, 1005645, 1006146, 1006645, 1007177, 1007678, 1008209, 1008710, 1009211, 1009743, 1010243, 1010743, 1011275, 1011775, 1012306, 1012807, 1013308, 1013840, 1014341, 1014841, 1015373, 1015874, 1016404, 1016905, 1017405, 1017937, 1018438, 1018939, 1019471, 1019972, 1020471, 1021002, 1021503, 1022035, 1022535, 1023036, 1023568, 1024069, 1024568, 1025100, 1025601, 1026102, 1026633, 1027133, 1027666, 1028167, 1028666, 1029198, 1029699, 1030199, 1030730, 1031231, 1031763, 1032264, 1032764, 1033296, 1033797, 1034297, 1034828, 1035329, 1035830, 1036362, 1036861, 1037393, 1037894, 1038394, 1038925, 1039427, 1039927, 1040459, 1040959, 1041491, 1041992, 1042492, 1043023, 1043524, 1044024, 1044556, 1045057, 1045558, 1046090, 1046590, 1047121, 1047622, 1048122, 1048654, 1049154, 1049655, 1050187, 1050689, 1051219, 1051720, 1052220, 1052751, 1053252, 1053752, 1054284, 1054786, 1055285, 1055817, 1056317, 1056849, 1057349, 1057850, 1058382, 1058883, 1059383, 1059915, 1060415, 1060947, 1061447, 1061947, 1062479, 1062981, 1063480, 1064012, 1064514, 1065014, 1065545, 1066045, 1066577, 1067078, 1067578, 1068110, 1068611, 1069112, 1069642, 1070142, 1070674, 1071175, 1071675, 1072207, 1072709, 1073209, 1073740, 1074241, 1074741, 1075273, 1075773, 1076305, 1076807, 1077308, 1077839, 1078340, 1078840, 1079372, 1079871, 1080403, 1080904};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final double[] f24318d = {-4000.0d, 108371.7d, -13036.8d, 392.0d, 0.0d, -500.0d, 17201.0d, -627.82d, 16.17d, -0.3413d, -150.0d, 12200.6d, -346.41d, 5.403d, -0.1593d, 150.0d, 9113.8d, -328.13d, -1.647d, 0.0377d, 500.0d, 5707.5d, -391.41d, 0.915d, 0.3145d, 900.0d, 2203.4d, -283.45d, 13.034d, -0.1778d, 1300.0d, 490.1d, -57.35d, 2.085d, -0.0072d, 1600.0d, 120.0d, -9.81d, -1.532d, 0.1403d, 1700.0d, 10.2d, -0.91d, 0.51d, -0.037d, 1800.0d, 13.4d, -0.72d, 0.202d, -0.0193d, 1830.0d, 7.8d, -1.81d, 0.416d, -0.0247d, 1860.0d, 8.3d, -0.13d, -0.406d, 0.0292d, 1880.0d, -5.4d, 0.32d, -0.183d, 0.0173d, 1900.0d, -2.3d, 2.06d, 0.169d, -0.0135d, 1920.0d, 21.2d, 1.69d, -0.304d, 0.0167d, 1940.0d, 24.2d, 1.22d, -0.064d, 0.0031d, 1960.0d, 33.2d, 0.51d, 0.231d, -0.0109d, 1980.0d, 51.0d, 1.29d, -0.026d, 0.0032d, 2000.0d, 64.7d, -1.66d, 5.224d, -0.2905d, 2150.0d, 279.4d, 732.95d, 429.579d, 0.0158d, 6000.0d};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final double[] f24319e = {0.016708634d, -4.2037E-5d, -1.267E-7d};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final double[] f24320f = {1.796595680777785d, 0.030010238356341697d, 8.028514559173916E-6d};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final double[] f24321g = {4.89506311081711d, 628.3319667475674d, 5.291887161265863E-6d, 0.0d, 0.0d};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final double[] f24322h = {2.1824391966d, -33.757045954d, 3.62262E-5d, 3.734E-8d, -2.8793E-10d, -171996.0d, -1742.0d, 92025.0d, 89.0d, 3.5069406862d, 1256.663930738d, 1.05845E-5d, 6.9813E-10d, -2.2815E-10d, -13187.0d, -16.0d, 5736.0d, -31.0d, 1.3375032491d, 16799.418221925d, -5.11866E-5d, 6.4626E-8d, -5.3543E-10d, -2274.0d, -2.0d, 977.0d, -5.0d, 4.3648783932d, -67.514091907d, 7.24525E-5d, 7.4681E-8d, -5.7586E-10d, 2062.0d, 2.0d, -895.0d, 5.0d, 0.0431251803d, -628.301955171d, 2.682E-6d, 6.5935E-10d, 5.5705E-11d, -1426.0d, 34.0d, 54.0d, -1.0d, 2.3555557435d, 8328.691425719d, 1.545547E-4d, 2.5033E-7d, -1.1863E-9d, 712.0d, 1.0d, -7.0d, 0.0d, 3.4638155059d, 1884.965885909d, 7.9025E-6d, 3.8785E-11d, -2.8386E-10d, -517.0d, 12.0d, 224.0d, -6.0d, 5.4382493597d, 16833.175267879d, -8.74129E-5d, 2.7285E-8d, -2.475E-10d, -386.0d, -4.0d, 200.0d, 0.0d, 3.6930589926d, 25128.109647645d, 1.033681E-4d, 3.1496E-7d, -1.7218E-9d, -301.0d, 0.0d, 129.0d, -1.0d, 3.5500658664d, 628.361975567d, 1.32664E-5d, 1.3575E-9d, -1.7245E-10d, 217.0d, -5.0d, -95.0d, 3.0d};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final double[] f24323i = {1.75347045673d, 0.0d, 0.0d, 0.03341656456d, 4.66925680417d, 6283.0758499914d, 3.4894275E-4d, 4.62610241759d, 12566.1516999828d, 3.417571E-5d, 2.82886579606d, 3.523118349d, 3.497056E-5d, 2.74411800971d, 5753.3848848968d, 3.135896E-5d, 3.62767041758d, 77713.7714681205d, 2.676218E-5d, 4.41808351397d, 7860.4193924392d, 2.342687E-5d, 6.13516237631d, 3930.2096962196d, 1.273166E-5d, 2.03709655772d, 529.6909650946d, 1.324292E-5d, 0.74246356352d, 11506.7697697936d, 9.01855E-6d, 2.04505443513d, 26.2983197998d, 1.199167E-5d, 1.10962944315d, 1577.3435424478d, 8.57223E-6d, 3.50849156957d, 398.1490034082d, 7.79786E-6d, 1.17882652114d, 5223.6939198022d, 9.9025E-6d, 5.23268129594d, 5884.9268465832d, 7.53141E-6d, 2.53339053818d, 5507.5532386674d, 5.05264E-6d, 4.58292563052d, 18849.2275499742d, 4.92379E-6d, 4.20506639861d, 775.522611324d, 3.56655E-6d, 2.91954116867d, 0.0673103028d, 2.84125E-6d, 1.89869034186d, 796.2980068164d, 2.4281E-6d, 0.34481140906d, 5486.777843175d, 3.17087E-6d, 5.84901952218d, 11790.6290886588d, 2.71039E-6d, 0.31488607649d, 10977.078804699d, 2.0616E-6d, 4.80646606059d, 2544.3144198834d, 2.05385E-6d, 1.86947813692d, 5573.1428014331d, 2.02261E-6d, 2.45767795458d, 6069.7767545534d, 1.26184E-6d, 1.0830263021d, 20.7753954924d, 1.55516E-6d, 0.83306073807d, 213.299095438d, 1.15132E-6d, 0.64544911683d, 0.9803210682d, 1.02851E-6d, 0.63599846727d, 4694.0029547076d, 1.01724E-6d, 4.26679821365d, 7.1135470008d, 9.9206E-7d, 6.20992940258d, 2146.1654164752d, 1.32212E-6d, 3.41118275555d, 2942.4634232916d, 9.7607E-7d, 0.6810127227d, 155.4203994342d, 8.5128E-7d, 1.29870743025d, 6275.9623029906d, 7.4651E-7d, 1.75508916159d, 5088.6288397668d, 1.01895E-6d, 0.97569221824d, 15720.8387848784d, 8.4711E-7d, 3.67080093025d, 71430.6956181291d, 7.3547E-7d, 4.67926565481d, 801.8209311238d, 7.3874E-7d, 3.50319443167d, 3154.6870848956d, 7.8756E-7d, 3.03698313141d, 12036.4607348882d, 7.9637E-7d, 1.807913307d, 17260.1546546904d, 8.5803E-7d, 5.98322631256d, 161000.6857376741d, 5.6963E-7d, 2.78430398043d, 6286.5989683404d, 6.1148E-7d, 1.81839811024d, 7084.8967811152d, 6.9627E-7d, 0.83297596966d, 9437.762934887d, 5.6116E-7d, 4.38694880779d, 14143.4952424306d, 6.2449E-7d, 3.97763880587d, 8827.3902698748d, 5.1145E-7d, 0.28306864501d, 5856.4776591154d, 5.5577E-7d, 3.47006009062d, 6279.5527316424d, 4.1036E-7d, 5.36817351402d, 8429.2412664666d, 5.1605E-7d, 1.33282746983d, 1748.016413067d, 5.1992E-7d, 0.18914945834d, 12139.5535091068d, 4.9E-7d, 0.48735065033d, 1194.4470102246d, 3.92E-7d, 6.16832995016d, 10447.3878396044d, 3.5566E-7d, 1.77597314691d, 6812.766815086d, 3.677E-7d, 6.04133859347d, 10213.285546211d, 3.6596E-7d, 2.56955238628d, 1059.3819301892d, 3.3291E-7d, 0.59309499459d, 17789.845619785d, 3.5954E-7d, 1.70876111898d, 2352.8661537718d};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final double[] f24324j = {6283.31966747491d, 0.0d, 0.0d, 0.00206058863d, 2.67823455584d, 6283.0758499914d, 4.30343E-5d, 2.63512650414d, 12566.1516999828d, 4.25264E-6d, 1.59046980729d, 3.523118349d, 1.08977E-6d, 2.96618001993d, 1577.3435424478d, 9.3478E-7d, 2.59212835365d, 18849.2275499742d, 1.19261E-6d, 5.79557487799d, 26.2983197998d, 7.2122E-7d, 1.13846158196d, 529.6909650946d, 6.7768E-7d, 1.87472304791d, 398.1490034082d, 6.7327E-7d, 4.40918235168d, 5507.5532386674d, 5.9027E-7d, 2.8879703846d, 5223.6939198022d, 5.5976E-7d, 2.17471680261d, 155.4203994342d, 4.5407E-7d, 0.39803079805d, 796.2980068164d, 3.6369E-7d, 0.46624739835d, 775.522611324d, 2.8958E-7d, 2.64707383882d, 7.1135470008d, 1.9097E-7d, 1.84628332577d, 5486.777843175d, 2.0844E-7d, 5.34138275149d, 0.9803210682d, 1.8508E-7d, 4.96855124577d, 213.299095438d, 1.6233E-7d, 0.03216483047d, 2544.3144198834d, 1.7293E-7d, 2.99116864949d, 6275.9623029906d};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final double[] f24325k = {5.291887E-4d, 0.0d, 0.0d, 8.719837E-5d, 1.07209665242d, 6283.0758499914d, 3.09125E-6d, 0.86728818832d, 12566.1516999828d, 2.7339E-7d, 0.05297871691d, 3.523118349d, 1.6334E-7d, 5.18826691036d, 26.2983197998d, 1.5752E-7d, 3.6845788943d, 155.4203994342d, 9.541E-8d, 0.75742297675d, 18849.2275499742d, 8.937E-8d, 2.05705419118d, 77713.7714681205d, 6.952E-8d, 0.8267330541d, 775.522611324d, 5.064E-8d, 4.66284525271d, 1577.3435424478d};

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final double[] f24326l = {2.89226E-6d, 5.84384198723d, 6283.0758499914d, 3.4955E-7d, 0.0d, 0.0d, 1.6819E-7d, 5.48766912348d, 12566.1516999828d};

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final double[] f24327m = {1.14084E-6d, 3.14159265359d, 0.0d, 7.717E-8d, 4.13446589358d, 6283.0758499914d, 7.65E-9d, 3.83803776214d, 12566.1516999828d};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final double[] f24328n = {8.78E-9d, 3.14159265359d, 0.0d};

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final double[] f24329o = {2.7962E-6d, 3.19870156017d, 84334.6615813083d, 1.01643E-6d, 5.42248619256d, 5507.5532386674d, 8.0445E-7d, 3.88013204458d, 5223.6939198022d, 4.3806E-7d, 3.70444689758d, 2352.8661537718d, 3.1933E-7d, 4.00026369781d, 1577.3435424478d, 2.2724E-7d, 3.9847383156d, 1047.7473117547d, 1.6392E-7d, 3.56456119782d, 5856.4776591154d, 1.8141E-7d, 4.98367470263d, 6283.0758499914d, 1.4443E-7d, 3.70275614914d, 9437.762934887d, 1.4304E-7d, 3.41117857525d, 10213.285546211d};

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final double[] f24330p = {9.03E-8d, 3.8972906189d, 5507.5532386674d, 6.177E-8d, 1.73038850355d, 5223.6939198022d};

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final double[] f24331q = {1.00013988799d, 0.0d, 0.0d, 0.01670699626d, 3.09846350771d, 6283.0758499914d, 1.3956023E-4d, 3.0552460962d, 12566.1516999828d, 3.08372E-5d, 5.19846674381d, 77713.7714681205d, 1.628461E-5d, 1.17387749012d, 5753.3848848968d, 1.575568E-5d, 2.84685245825d, 7860.4193924392d, 9.24799E-6d, 5.45292234084d, 11506.7697697936d, 5.42444E-6d, 4.56409149777d, 3930.2096962196d};

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final double[] f24332r = {0.00103018608d, 1.10748969588d, 6283.0758499914d, 1.721238E-5d, 1.06442301418d, 12566.1516999828d, 7.02215E-6d, 3.14159265359d, 0.0d};

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final double[] f24333s = {4.359385E-5d, 5.78455133738d, 6283.0758499914d};
    public static final double[] t = {1.44595E-6d, 4.27319435148d, 6283.0758499914d};

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static double f24334u = 0.0d;

    public static String a(double d2) {
        int i7 = (int) d2;
        return d2 < 10.0d ? C0.G.m(i7, "0") : String.valueOf(i7);
    }

    public static double b(double[] dArr) {
        double dCos = 0.0d;
        for (int i7 = 0; i7 < dArr.length; i7 += 3) {
            dCos += Math.cos((f24334u * dArr[i7 + 2]) + dArr[i7 + 1]) * dArr[i7];
        }
        return dCos;
    }

    public static double c(double d2, double d10) {
        double d11 = d2 / 365250.0d;
        f24334u = d11;
        double d12 = d11 * d11;
        double d13 = d12 * d11;
        double d14 = d13 * d11;
        double[] dArr = {(b(f24328n) * d14 * d11) + (b(f24327m) * d14) + (b(f24326l) * d13) + (b(f24325k) * d12) + (b(f24324j) * d11) + b(f24323i), (b(f24330p) * d11) + b(f24329o), (b(t) * d13) + (b(f24333s) * d12) + (b(f24332r) * d11) + b(f24331q)};
        double dW = w(dArr[0]);
        dArr[0] = dW;
        double d15 = dW + 3.141592653589793d;
        dArr[0] = d15;
        dArr[1] = -dArr[1];
        double d16 = d2 / 36525.0d;
        double d17 = d16 * d16;
        double d18 = d17 * d16;
        double d19 = d18 * d16;
        double[] dArr2 = f24321g;
        double d20 = (dArr2[4] * d19) + (dArr2[3] * d18) + (dArr2[2] * d17) + (dArr2[1] * d16) + dArr2[0];
        double[] dArr3 = f24320f;
        double d21 = (dArr3[2] * d17) + (dArr3[1] * d16) + dArr3[0];
        double[] dArr4 = f24319e;
        double d22 = (dArr4[2] * d17) + (dArr4[1] * d16) + dArr4[0];
        double d23 = d20 - d15;
        double d24 = d21 - d15;
        dArr[0] = d15 - (((Math.cos(d23) - (Math.cos(d24) * d22)) * 9.936508497454117E-5d) / Math.cos(dArr[1]));
        double d25 = dArr[1];
        dArr[1] = d25 - ((Math.sin(d23) - (Math.sin(d24) * d22)) * (Math.sin(d25) * 9.936508497454117E-5d));
        dArr[0] = w(dArr[0]);
        double dSin = 0.0d;
        for (int i7 = 0; i7 < 90; i7 += 9) {
            double[] dArr5 = f24322h;
            double d26 = (dArr5[i7 + 4] * d19) + (dArr5[i7 + 3] * d18) + (dArr5[i7 + 2] * d17) + (dArr5[i7 + 1] * d16) + dArr5[i7];
            dSin = (Math.sin(d26) * (((dArr5[i7 + 6] * d16) / 10.0d) + dArr5[i7 + 5])) + dSin;
            double d27 = dArr5[i7 + 7];
            double d28 = dArr5[i7 + 8];
            Math.cos(d26);
        }
        double d29 = dArr[0] + (dSin / 2.0626480624709637E9d);
        dArr[0] = d29;
        return w(d10 - d29);
    }

    public static int d(int i7, int i10, int i11, p pVar) {
        int i12 = pVar.f24261b;
        C1435e c1435e = pVar.f24275j0;
        boolean z3 = i7 == c1435e.f24201a && i10 == c1435e.f24202b;
        if (!pVar.f24263d || !z3) {
            Calendar.getInstance().set(i7, i10 - 1, 1, 12, 0, 0);
            int iN = n(i7, i10, 1, i12);
            int iK = k(i7, i10);
            return (((iN + iK) + l(pVar, i7, i10, iK, i12)) / 7) * i11;
        }
        int iJ = j(pVar, i12);
        int i13 = pVar.f24275j0.f24203c;
        int iK2 = k(i7, i10);
        int iL = l(pVar, i7, i10, i13, i12);
        return (int) (Math.ceil(((iJ + i13) + (i13 + iL > iK2 ? iL : 0)) / 7.0f) * ((double) i11));
    }

    public static int e(Context context, float f10) {
        return (int) ((f10 * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static double f(double d2) {
        double dFloor = Math.floor(d2);
        return dFloor < 0.0d ? dFloor + 1.0d : dFloor;
    }

    public static int g(int i7, int i10, int i11) {
        return (i7 & (((1 << i10) - 1) << i11)) >> i11;
    }

    public static int h(String str, Date date) {
        return Integer.parseInt(new SimpleDateFormat(str).format(date));
    }

    public static C1435e i(int i7, int i10, int i11, int i12, int i13) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(i7, i10 - 1, i11, 12, 0);
        long timeInMillis = (((long) ((i12 - 1) * 7)) * 86400000) + calendar.getTimeInMillis();
        calendar.setTimeInMillis(timeInMillis);
        calendar.setTimeInMillis(timeInMillis - (((long) s(calendar.get(1), calendar.get(2) + 1, calendar.get(5), i13)) * 86400000));
        C1435e c1435e = new C1435e();
        c1435e.f24201a = calendar.get(1);
        c1435e.f24202b = calendar.get(2) + 1;
        c1435e.f24203c = calendar.get(5);
        return c1435e;
    }

    public static int j(p pVar, int i7) {
        C1435e c1435e = pVar.f24275j0;
        int i10 = 30 - c1435e.f24203c;
        Calendar calendarD = c1435e.d();
        calendarD.add(5, -29);
        return n(calendarD.get(1), calendarD.get(2) + 1, calendarD.get(5), i7) + i10;
    }

    public static int k(int i7, int i10) {
        int i11 = (i10 == 1 || i10 == 3 || i10 == 5 || i10 == 7 || i10 == 8 || i10 == 10 || i10 == 12) ? 31 : 0;
        if (i10 == 4 || i10 == 6 || i10 == 9 || i10 == 11) {
            i11 = 30;
        }
        if (i10 == 2) {
            return ((i7 % 4 != 0 || i7 % 100 == 0) && i7 % 400 != 0) ? 28 : 29;
        }
        return i11;
    }

    public static int l(p pVar, int i7, int i10, int i11, int i12) {
        Calendar calendar = pVar == null ? Calendar.getInstance() : pVar.f24275j0.d();
        calendar.set(i7, i10 - 1, i11);
        int i13 = calendar.get(7);
        if (i12 == 1) {
            return 7 - i13;
        }
        if (i12 == 2) {
            if (i13 == 1) {
                return 0;
            }
            return 8 - i13;
        }
        if (i13 == 7) {
            return 6;
        }
        return 6 - i13;
    }

    public static int m(int i7, int i10, int i11, p pVar) {
        int i12 = pVar.f24262c;
        C1435e c1435e = pVar.f24275j0;
        if (i7 != c1435e.f24201a || i10 == c1435e.f24202b) {
        }
        boolean z3 = pVar.f24263d;
        return i12 == 0 ? i11 * 6 : d(i7, i10, i11, pVar);
    }

    public static int n(int i7, int i10, int i11, int i12) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(i7, i10 - 1, i11, 12, 0, 0);
        int i13 = calendar.get(7);
        if (i12 == 1) {
            return i13 - 1;
        }
        if (i12 == 2) {
            if (i13 == 1) {
                return 6;
            }
            return i13 - i12;
        }
        if (i13 == 7) {
            return 0;
        }
        return i13;
    }

    public static int o(C1435e c1435e, int i7) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(c1435e.f24201a, c1435e.f24202b - 1, 1, 12, 0, 0);
        int i10 = calendar.get(7);
        if (i7 == 1) {
            return i10 - 1;
        }
        if (i7 == 2) {
            if (i10 == 1) {
                return 6;
            }
            return i10 - i7;
        }
        if (i10 == 7) {
            return 0;
        }
        return i10;
    }

    public static double p(double d2, double d10) {
        double d11 = d2;
        double d12 = 360.0d + d11;
        double d13 = 0.017453292519943295d * d10;
        double dC = c(d11, d13);
        double dC2 = c(d12, d13);
        if (dC < dC2) {
            dC2 -= 6.283185307179586d;
        }
        double d14 = 0.0d;
        int i7 = 0;
        double d15 = dC2;
        double d16 = dC;
        double d17 = d15;
        double d18 = 1.0d;
        while (i7 < 10) {
            double d19 = (d17 - d16) / (d12 - d11);
            if (Math.abs(d19) > 1.0E-15d) {
                d18 = d19;
            }
            double d20 = d11 - (d16 / d18);
            double dC3 = c(d20, d13);
            if (dC3 > 1.0d) {
                dC3 -= 6.283185307179586d;
            }
            if (Math.abs(dC3) < 1.0E-8d) {
                return d20;
            }
            i7++;
            double d21 = dC3;
            d16 = d17;
            d17 = d21;
            d14 = d20;
            d11 = d12;
            d12 = d14;
        }
        return d14;
    }

    public static int q(int i7, int i10, int i11, int i12, int i13, int i14, int i15) {
        int i16;
        Calendar calendar = Calendar.getInstance();
        calendar.set(i7, i10 - 1, i11);
        long timeInMillis = calendar.getTimeInMillis();
        int iS = s(i7, i10, i11, i15);
        int i17 = i13 - 1;
        calendar.set(i12, i17, i14);
        long timeInMillis2 = calendar.getTimeInMillis();
        Calendar calendar2 = Calendar.getInstance();
        calendar2.set(i12, i17, i14, 12, 0);
        int i18 = calendar2.get(7);
        if (i15 == 1) {
            i16 = 7 - i18;
        } else if (i15 == 2) {
            i16 = i18 == 1 ? 0 : 8 - i18;
        } else {
            i16 = 6;
            if (i18 != 7) {
                i16 = 6 - i18;
            }
        }
        return ((((int) ((timeInMillis2 - timeInMillis) / 86400000)) + 1) + (iS + i16)) / 7;
    }

    public static int r(C1435e c1435e, int i7) {
        Calendar.getInstance().set(c1435e.f24201a, c1435e.f24202b - 1, 1, 12, 0, 0);
        return (((c1435e.f24203c + o(c1435e, i7)) - 1) / 7) + 1;
    }

    public static int s(int i7, int i10, int i11, int i12) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(i7, i10 - 1, i11, 12, 0);
        int i13 = calendar.get(7);
        if (i12 == 1) {
            return i13 - 1;
        }
        if (i12 == 2) {
            if (i13 == 1) {
                return 6;
            }
            return i13 - i12;
        }
        if (i13 == 7) {
            return 0;
        }
        return i13;
    }

    public static ArrayList t(p pVar, int i7, int i10, C1435e c1435e, int i11, boolean z3) {
        int iK;
        int i12;
        int i13;
        int i14;
        int i15 = i10 - 1;
        Calendar.getInstance().set(i7, i15, 1);
        int iJ = z3 ? j(pVar, i11) : n(i7, i10, 1, i11);
        int iK2 = k(i7, i10);
        ArrayList arrayList = new ArrayList();
        int i16 = 12;
        if (i10 == 1) {
            i12 = i7 - 1;
            int i17 = i10 + 1;
            iK = iJ == 0 ? 0 : k(i12, 12);
            i13 = i17;
            i14 = i7;
        } else if (i10 == 12) {
            i14 = i7 + 1;
            iK = iJ == 0 ? 0 : k(i7, i15);
            i16 = i15;
            i13 = 1;
            i12 = i7;
        } else {
            int i18 = i10 + 1;
            i16 = i15;
            iK = iJ == 0 ? 0 : k(i7, i15);
            i12 = i7;
            i13 = i18;
            i14 = i12;
        }
        int i19 = 1;
        for (int i20 = 0; i20 < 42; i20++) {
            C1435e c1435e2 = new C1435e();
            if (i20 < iJ) {
                c1435e2.f24201a = i12;
                c1435e2.f24202b = i16;
                int i21 = (iK - iJ) + i20 + 1;
                if (z3 && i21 <= 0) {
                    int i22 = i16 - 1;
                    int iK3 = k(i12, i22);
                    c1435e2.f24202b = i22;
                    i21 += iK3;
                }
                c1435e2.f24203c = i21;
            } else if (i20 >= iK2 + iJ) {
                c1435e2.f24201a = i14;
                c1435e2.f24202b = i13;
                c1435e2.f24203c = i19;
                i19++;
            } else {
                c1435e2.f24201a = i7;
                c1435e2.f24202b = i10;
                c1435e2.f24204d = true;
                c1435e2.f24203c = (i20 - iJ) + 1;
            }
            if (c1435e2.equals(c1435e)) {
                c1435e2.f24205e = true;
            }
            r.c(c1435e2);
            arrayList.add(c1435e2);
        }
        return arrayList;
    }

    public static ArrayList u(C1435e c1435e, p pVar) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(c1435e.f24201a, c1435e.f24202b - 1, c1435e.f24203c, 12, 0);
        long timeInMillis = calendar.getTimeInMillis();
        ArrayList arrayList = new ArrayList();
        calendar.setTimeInMillis(timeInMillis);
        C1435e c1435e2 = new C1435e();
        c1435e2.f24201a = c1435e.f24201a;
        c1435e2.f24202b = c1435e.f24202b;
        c1435e2.f24203c = c1435e.f24203c;
        if (c1435e2.equals(pVar.f24275j0)) {
            c1435e2.f24205e = true;
        }
        r.c(c1435e2);
        c1435e2.f24204d = true;
        arrayList.add(c1435e2);
        for (int i7 = 1; i7 <= 6; i7++) {
            calendar.setTimeInMillis((((long) i7) * 86400000) + timeInMillis);
            C1435e c1435e3 = new C1435e();
            c1435e3.f24201a = calendar.get(1);
            c1435e3.f24202b = calendar.get(2) + 1;
            c1435e3.f24203c = calendar.get(5);
            if (c1435e3.equals(pVar.f24275j0)) {
                c1435e3.f24205e = true;
            }
            r.c(c1435e3);
            c1435e3.f24204d = true;
            arrayList.add(c1435e3);
        }
        return arrayList;
    }

    public static boolean v(C1435e c1435e, p pVar) {
        int i7 = pVar.f24257Y;
        int i10 = pVar.f24260a0;
        int i11 = pVar.f24258Z;
        int i12 = pVar.b0;
        int i13 = pVar.f24264d0;
        Calendar calendar = Calendar.getInstance();
        calendar.set(i7, i10 - 1, pVar.c0);
        long timeInMillis = calendar.getTimeInMillis();
        calendar.set(i11, i12 - 1, i13);
        long timeInMillis2 = calendar.getTimeInMillis();
        calendar.set(c1435e.f24201a, c1435e.f24202b - 1, c1435e.f24203c);
        long timeInMillis3 = calendar.getTimeInMillis();
        return timeInMillis3 >= timeInMillis && timeInMillis3 <= timeInMillis2;
    }

    public static double w(double d2) {
        double d10 = d2 % 6.283185307179586d;
        return d10 < 0.0d ? d10 + 6.283185307179586d : d10;
    }

    public static x x(double d2) {
        double[] dArr;
        x xVar = new x();
        double d10 = ((d2 - 2451545.0d) / 365.2425d) + 2000.0d;
        int i7 = 0;
        while (true) {
            dArr = f24318d;
            if (i7 >= 100) {
                break;
            }
            int i10 = i7 + 5;
            if (d10 < dArr[i10] || i7 == 95) {
                break;
            }
            i7 = i10;
        }
        double d11 = dArr[i7];
        double d12 = ((d10 - d11) / (dArr[i7 + 5] - d11)) * 10.0d;
        double d13 = d12 * d12;
        double d14 = d13 * d12;
        double d15 = (d2 - (((dArr[i7 + 4] * d14) + ((dArr[i7 + 3] * d13) + ((dArr[i7 + 2] * d12) + dArr[i7 + 1]))) / 86400.0d)) + 0.5d;
        double dF = f(d15);
        double d16 = d15 - dF;
        if (dF > 2299161.0d) {
            double dF2 = f((dF - 1867216.25d) / 36524.25d);
            dF += (dF2 + 1.0d) - f(dF2 / 4.0d);
        }
        double d17 = dF + 1524.0d;
        double dF3 = f((d17 - 122.1d) / 365.25d);
        xVar.f24347a = dF3;
        double dF4 = d17 - f(dF3 * 365.25d);
        double dF5 = f(dF4 / 30.6001d);
        xVar.f24348b = dF5;
        xVar.f24349c = dF4 - f(dF5 * 30.6001d);
        double d18 = xVar.f24347a - 4716.0d;
        xVar.f24347a = d18;
        double d19 = xVar.f24348b - 1.0d;
        xVar.f24348b = d19;
        if (d19 > 12.0d) {
            xVar.f24348b = d19 - 12.0d;
        }
        if (xVar.f24348b <= 2.0d) {
            xVar.f24347a = d18 + 1.0d;
        }
        double d20 = d16 * 24.0d;
        f((d20 - f(d20)) * 60.0d);
        return xVar;
    }

    public static long y(int i7, int i10, int i11) {
        int i12 = (i10 + 9) % 12;
        int i13 = i7 - (i12 / 10);
        return (i11 - 1) + (((i12 * MessageEvent.EVENT_FINISH_QUTELLER_PAY_PREVIEW_PAGE) + 5) / 10) + (i13 / 400) + (((i13 / 4) + (i13 * 365)) - (i13 / 100));
    }
}
