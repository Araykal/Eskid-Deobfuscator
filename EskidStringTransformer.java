package uwu.narumi.deobfuscator.transformer.impl.eskid;

import org.objectweb.asm.tree.*;
import uwu.narumi.deobfuscator.Deobfuscator;
import uwu.narumi.deobfuscator.transformer.Transformer;


import java.util.ArrayList;


public class EskidStringTransformer extends Transformer {

    public static String deString(String string, int n) {
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        for (int i = 0; i < cArray.length; ++i) {
            int n3 = i;
            int n4 = -n3;
            int n6;
            int n7 = n4 -1;

            switch (n7 + (((int)-1891032720L ^ 0x8F49218F) & (n7 ^ (int)((long)108882464 ^ (long)-108882465))) - (-n3 + (int)((long)-254476472 ^ (long)254476471))) {
                case 0: {
                    n6 = (int)557902903L ^ 0x2140EC96;
                    break;
                }
                case 1: {
                    n6 = (int)-1941044958L ^ 0x8C4E01C5;
                    break;
                }
                case 2: {
                    n6 = (int)-344536419L ^ 0xEB76CA11;
                    break;
                }
                case 3: {
                    n6 = (int)((long)1400685905 ^ (long)1400685857);
                    break;
                }
                case 4: {
                    n6 = (int)((long)-221387839 ^ (long)-221387785);
                    break;
                }
                case 5: {
                    n6 = (int)1648953849L ^ 0x6249097A;
                    break;
                }
                case 6: {
                    n6 = (int)-2060455534L ^ 0x852FF11C;
                    break;
                }
                case 7: {
                    n6 = (int)1853783848L ^ 0x6E7E7FB9;
                    break;
                }
                case 8: {
                    n6 = (int)1082208102L ^ 0x40812FDA;
                    break;
                }
                case 9: {
                    n6 = (int)((long)-1362651102 ^ (long)-1362651135);
                    break;
                }
                case 10: {
                    n6 = (int)((long)-193491939 ^ (long)-193491959);
                    break;
                }
                case 11: {
                    n6 = (int)((long)872160476 ^ (long)872160487);
                    break;
                }
                case 12: {
                    n6 = (int)-1522048823L ^ 0xA547603F;
                    break;
                }
                case 13: {
                    n6 = (int)1019434152L ^ 0x3CC354E0;
                    break;
                }
                case 14: {
                    n6 = (int)-527745547L ^ 0xE08B3DA5;
                    break;
                }
                case 15: {
                    n6 = (int)((long)-746147020 ^ (long)-746146958);
                    break;
                }
                case 16: {
                    n6 = (int)475838697L ^ 0x1C5CB84F;
                    break;
                }
                case 17: {
                    n6 = (int)-222683402L ^ 0xF2BA1E86;
                    break;
                }
                case 18: {
                    n6 = (int)((long)-496021138 ^ (long)-496021060);
                    break;
                }
                case 19: {
                    n6 = (int)((long)-1119499611 ^ (long)-1119499632);
                    break;
                }
                case 20: {
                    n6 = (int)((long)644311370 ^ (long)644311310);
                    break;
                }
                case 21: {
                    n6 = (int)660333188L ^ 0x275BE2CB;
                    break;
                }
                case 22: {
                    n6 = (int)-1771490533L ^ 0x966933A9;
                    break;
                }
                case 23: {
                    n6 = (int)-804755520L ^ 0xD00867B9;
                    break;
                }
                case 24: {
                    n6 = (int)((long)-734320693 ^ (long)-734320756);
                    break;
                }
                case 25: {
                    n6 = (int)((long)-1125438255 ^ (long)-1125438383);
                    break;
                }
                case 26: {
                    n6 = (int)((long)1327660367 ^ (long)1327660307);
                    break;
                }
                case 27: {
                    n6 = (int)-244113029L ^ 0xF173215F;
                    break;
                }
                case 28: {
                    n6 = (int)((long)673316801 ^ (long)673316777);
                    break;
                }
                case 29: {
                    n6 = (int)1459589774L ^ 0x56FF9277;
                    break;
                }
                case 30: {
                    n6 = (int)-811877142L ^ 0xCF9BBC43;
                    break;
                }
                case 31: {
                    n6 = (int)25466734L ^ 0x18497A3;
                    break;
                }
                case 32: {
                    n6 = (int)-134441595L ^ 0xF7FC9565;
                    break;
                }
                case 33: {
                    n6 = (int)((long)-1522383477 ^ (long)-1522383468);
                    break;
                }
                case 34: {
                    n6 = (int)((long)-2078158199 ^ (long)-2078158325);
                    break;
                }
                case 35: {
                    n6 = (int)((long)-472131383 ^ (long)-472131494);
                    break;
                }
                case 36: {
                    n6 = (int)-1738330929L ^ 0x98632CD7;
                    break;
                }
                case 37: {
                    n6 = (int)((long)279563185 ^ (long)279563021);
                    break;
                }
                case 38: {
                    n6 = (int)((long)-856387892 ^ (long)-856387871);
                    break;
                }
                case 39: {
                    n6 = (int)781813622L ^ 0x2E998721;
                    break;
                }
                case 40: {
                    n6 = (int)((long)-836946516 ^ (long)-836946544);
                    break;
                }
                case 41: {
                    n6 = (int)((long)889983978 ^ (long)889983862);
                    break;
                }
                case 42: {
                    n6 = (int)((long)-1490170844 ^ (long)-1490170776);
                    break;
                }
                case 43: {
                    n6 = (int)((long)827713858 ^ (long)827713939);
                    break;
                }
                case 44: {
                    n6 = (int)-1332642411L ^ 0xB0917D8D;
                    break;
                }
                case 45: {
                    n6 = (int)1468125676L ^ 0x5781D17E;
                    break;
                }
                case 46: {
                    n6 = (int)((long)-214430640 ^ (long)-214430528);
                    break;
                }
                case 47: {
                    n6 = (int)((long)177111267 ^ (long)177111221);
                    break;
                }
                case 48: {
                    n6 = (int)((long)-44574263 ^ (long)-44574410);
                    break;
                }
                case 49: {
                    n6 = (int)((long)-2058801348 ^ (long)-2058801390);
                    break;
                }
                case 50: {
                    n6 = (int)4763064L ^ 0x48ADD7;
                    break;
                }
                case 51: {
                    n6 = (int)-1106284142L ^ 0xBE0F7181;
                    break;
                }
                case 52: {
                    n6 = (int)((long)1474758234 ^ (long)1474758150);
                    break;
                }
                case 53: {
                    n6 = (int)((long)2139429750 ^ (long)2139429676);
                    break;
                }
                case 54: {
                    n6 = (int)((long)-180779635 ^ (long)-180779738);
                    break;
                }
                case 55: {
                    n6 = (int)-82837876L ^ 0xFB0FFE1C;
                    break;
                }
                case 56: {
                    n6 = (int)((long)913263617 ^ (long)913263731);
                    break;
                }
                case 57: {
                    n6 = (int)18307453L ^ 0x1175949;
                    break;
                }
                case 58: {
                    n6 = (int)1613436727L ^ 0x602B1702;
                    break;
                }
                case 59: {
                    n6 = (int)-391656606L ^ 0xE8A7CB3F;
                    break;
                }
                case 60: {
                    n6 = (int)((long)-1913374579 ^ (long)-1913374523);
                    break;
                }
                case 61: {
                    n6 = (int)1810477839L ^ 0x6BE9B365;
                    break;
                }
                case 62: {
                    n6 = (int)((long)558247358 ^ (long)558247410);
                    break;
                }
                case 63: {
                    n6 = (int)1527533136L ^ 0x5B0C4E60;
                    break;
                }
                case 64: {
                    n6 = (int)((long)2048312613 ^ (long)2048312703);
                    break;
                }
                case 65: {
                    n6 = (int)-1402603857L ^ 0xAC65F691;
                    break;
                }
                case 66: {
                    n6 = (int)((long)-2075339286 ^ (long)-2075339376);
                    break;
                }
                case 67: {
                    n6 = (int)-5309100L ^ 0xFFAEFD4D;
                    break;
                }
                case 68: {
                    n6 = (int)((long)901226771 ^ (long)901226908);
                    break;
                }
                case 69: {
                    n6 = (int)((long)1401135122 ^ (long)1401135344);
                    break;
                }
                case 70: {
                    n6 = (int)1123990433L ^ 0x42FEBBD1;
                    break;
                }
                case 71: {
                    n6 = (int)((long)1688964669 ^ (long)1688964675);
                    break;
                }
                case 72: {
                    n6 = (int)-1066103858L ^ 0xC0748B41;
                    break;
                }
                case 73: {
                    n6 = (int)((long)-440615614 ^ (long)-440615632);
                    break;
                }
                case 74: {
                    n6 = (int)79683764L ^ 0x4BFE093;
                    break;
                }
                case 75: {
                    n6 = (int)-913953112L ^ 0xC9862EA7;
                    break;
                }
                case 76: {
                    n6 = (int)1283309195L ^ 0x4C7DBE50;
                    break;
                }
                case 77: {
                    n6 = (int)1150834115L ^ 0x449855F4;
                    break;
                }
                case 78: {
                    n6 = (int)527570234L ^ 0x1F721588;
                    break;
                }
                case 79: {
                    n6 = (int)((long)570800896 ^ (long)570800957);
                    break;
                }
                case 80: {
                    n6 = (int)((long)1340247015 ^ (long)1340246995);
                    break;
                }
                case 81: {
                    n6 = (int)1254359305L ^ 0x4AC40177;
                    break;
                }
                case 82: {
                    n6 = (int)1623563610L ^ 0x60C59DEB;
                    break;
                }
                case 83: {
                    n6 = (int)((long)-857349045 ^ (long)-857349026);
                    break;
                }
                case 84: {
                    n6 = (int)((long)-630091389 ^ (long)-630091300);
                    break;
                }
                case 85: {
                    n6 = (int)((long)1286287707 ^ (long)1286287839);
                    break;
                }
                case 86: {
                    n6 = (int)((long)-1248905408 ^ (long)-1248905313);
                    break;
                }
                case 87: {
                    n6 = (int)53039901L ^ 0x329534C;
                    break;
                }
                case 88: {
                    n6 = (int)((long)-592505164 ^ (long)-592505228);
                    break;
                }
                case 89: {
                    n6 = (int)((long)1387852431 ^ (long)1387852399);
                    break;
                }
                case 90: {
                    n6 = (int)955285999L ^ 0x38F08193;
                    break;
                }
                case 91: {
                    n6 = (int)((long)-1694905381 ^ (long)-1694905592);
                    break;
                }
                case 92: {
                    n6 = (int)((long)763157486 ^ (long)763157459);
                    break;
                }
                case 93: {
                    n6 = (int)-535687996L ^ 0xE0120CC3;
                    break;
                }
                case 94: {
                    n6 = (int)146281084L ^ 0x8B8125A;
                    break;
                }
                case 95: {
                    n6 = (int)-522572251L ^ 0xE0DA2E00;
                    break;
                }
                case 96: {
                    n6 = (int)((long)1940843081 ^ (long)1940843119);
                    break;
                }
                case 97: {
                    n6 = (int)919544306L ^ 0x36CF2123;
                    break;
                }
                case 98: {
                    n6 = (int)((long)-1018161983 ^ (long)-1018162160);
                    break;
                }
                case 99: {
                    n6 = (int)((long)-494716635 ^ (long)-494716640);
                    break;
                }
                case 100: {
                    n6 = (int)((long)-258253066 ^ (long)-258253201);
                    break;
                }
                case 101: {
                    n6 = (int)((long)-1595952614 ^ (long)-1595952396);
                    break;
                }
                case 102: {
                    n6 = (int)((long)1932557946 ^ (long)1932557834);
                    break;
                }
                case 103: {
                    n6 = (int)((long)996996641 ^ (long)996996732);
                    break;
                }
                case 104: {
                    n6 = (int)((long)-1188532508 ^ (long)-1188532680);
                    break;
                }
                case 105: {
                    n6 = (int)((long)-2074681411 ^ (long)-2074681361);
                    break;
                }
                case 106: {
                    n6 = (int)1099045082L ^ 0x41821803;
                    break;
                }
                case 107: {
                    n6 = (int)-436246562L ^ 0xE5FF6733;
                    break;
                }
                case 108: {
                    n6 = (int)((long)1804491214 ^ (long)1804491217);
                    break;
                }
                case 109: {
                    n6 = (int)((long)-701068734 ^ (long)-701068768);
                    break;
                }
                case 110: {
                    n6 = (int)((long)-1408518868 ^ (long)-1408518832);
                    break;
                }
                case 111: {
                    n6 = (int)-436061948L ^ 0xE6023980;
                    break;
                }
                case 112: {
                    n6 = (int)((long)1389505967 ^ (long)1389505813);
                    break;
                }
                case 113: {
                    n6 = (int)((long)310361605 ^ (long)310361681);
                    break;
                }
                case 114: {
                    n6 = (int)((long)1786178391 ^ (long)1786178336);
                    break;
                }
                case 115: {
                    n6 = (int)-1297194626L ^ 0xB2AE6188;
                    break;
                }
                case 116: {
                    n6 = (int)((long)1917978329 ^ (long)1917978215);
                    break;
                }
                case 117: {
                    n6 = (int)((long)-97957077 ^ (long)-97957103);
                    break;
                }
                case 118: {
                    n6 = (int)233072568L ^ 0xDE467BA;
                    break;
                }
                case 119: {
                    n6 = (int)((long)-118255238 ^ (long)-118255197);
                    break;
                }
                case 120: {
                    n6 = (int)((long)-508906918 ^ (long)-508906926);
                    break;
                }
                case 121: {
                    n6 = (int)((long)1956200381 ^ (long)1956200269);
                    break;
                }
                case 122: {
                    n6 = (int)-2105599969L ^ 0x827F185E;
                    break;
                }
                case 123: {
                    n6 = (int)((long)-1908953316 ^ (long)-1908953259);
                    break;
                }
                case 124: {
                    n6 = (int)((long)1888905336 ^ (long)1888905272);
                    break;
                }
                case 125: {
                    n6 = (int)((long)1288311295 ^ (long)1288311194);
                    break;
                }
                case 126: {
                    n6 = (int)((long)154343503 ^ (long)154343560);
                    break;
                }
                case 127: {
                    n6 = (int)217698259L ^ 0xCF9CF15;
                    break;
                }
                case 128: {
                    n6 = (int)483538971L ^ 0x1CD23860;
                    break;
                }
                case 129: {
                    n6 = (int)366094500L ^ 0x15D2284A;
                    break;
                }
                case 130: {
                    n6 = (int)((long)72043916 ^ (long)72043828);
                    break;
                }
                case 131: {
                    n6 = (int)58083239L ^ 0x3764725;
                    break;
                }
                case 132: {
                    n6 = (int)367804093L ^ 0x15EC3E26;
                    break;
                }
                case 133: {
                    n6 = (int)-1103361087L ^ 0xBE3C0B8F;
                    break;
                }
                case 134: {
                    n6 = (int)((long)-82527433 ^ (long)-82527351);
                    break;
                }
                case 135: {
                    n6 = (int)((long)-260957222 ^ (long)-260957304);
                    break;
                }
                case 136: {
                    n6 = (int)((long)1037545787 ^ (long)1037545843);
                    break;
                }
                case 137: {
                    n6 = (int)-1603438035L ^ 0xA06D7AB9;
                    break;
                }
                case 138: {
                    n6 = (int)((long)1240224844 ^ (long)1240224935);
                    break;
                }
                case 139: {
                    n6 = (int)((long)-9380358 ^ (long)-9380587);
                    break;
                }
                case 140: {
                    n6 = (int)316959018L ^ 0x12E46984;
                    break;
                }
                case 141: {
                    n6 = (int)852679255L ^ 0x32D2DA45;
                    break;
                }
                case 142: {
                    n6 = (int)((long)1327201068 ^ (long)1327201110);
                    break;
                }
                case 143: {
                    n6 = (int)((long)1434973480 ^ (long)1434973631);
                    break;
                }
                case 144: {
                    n6 = (int)2084257058L ^ 0x7C3B3DCA;
                    break;
                }
                case 145: {
                    n6 = (int)((long)2058012854 ^ (long)2058012752);
                    break;
                }
                case 146: {
                    n6 = (int)((long)-912957251 ^ (long)-912957253);
                    break;
                }
                case 147: {
                    n6 = (int)-985447722L ^ 0xC54342BB;
                    break;
                }
                case 148: {
                    n6 = (int)-551548884L ^ 0xDF20084F;
                    break;
                }
                case 149: {
                    n6 = (int)320080851L ^ 0x13140BB2;
                    break;
                }
                case 150: {
                    n6 = (int)((long)-1122729447 ^ (long)-1122729472);
                    break;
                }
                case 151: {
                    n6 = (int)-968326571L ^ 0xC648820B;
                    break;
                }
                case 152: {
                    n6 = (int)-1779939739L ^ 0x95E846F0;
                    break;
                }
                case 153: {
                    n6 = (int)((long)1337136290 ^ (long)1337136304);
                    break;
                }
                case 154: {
                    n6 = (int)((long)-1957482730 ^ (long)-1957482730);
                    break;
                }
                case 155: {
                    n6 = (int)((long)-471965106 ^ (long)-471965126);
                    break;
                }
                case 156: {
                    n6 = (int)322511995L ^ 0x1339244B;
                    break;
                }
                case 157: {
                    n6 = (int)((long)-1380998594 ^ (long)-1380998613);
                    break;
                }
                case 158: {
                    n6 = (int)((long)92511371 ^ (long)92511458);
                    break;
                }
                case 159: {
                    n6 = (int)((long)-1525740557 ^ (long)-1525740556);
                    break;
                }
                case 160: {
                    n6 = (int)((long)55604131 ^ (long)55604100);
                    break;
                }
                case 161: {
                    n6 = (int)-1386755364L ^ 0xAD57CA4A;
                    break;
                }
                case 162: {
                    n6 = (int)-923418801L ^ 0xC8F5BFC6;
                    break;
                }
                case 163: {
                    n6 = (int)((long)116177303 ^ (long)116177248);
                    break;
                }
                case 164: {
                    n6 = (int)-1011099479L ^ 0xC3BBD88D;
                    break;
                }
                case 165: {
                    n6 = (int)((long)1507851700 ^ (long)1507851546);
                    break;
                }
                case 166: {
                    n6 = (int)1347196882L ^ 0x504C975C;
                    break;
                }
                case 167: {
                    n6 = (int)-743522524L ^ 0xD3AEBF69;
                    break;
                }
                case 168: {
                    n6 = (int)-954698255L ^ 0xC71875AC;
                    break;
                }
                case 169: {
                    n6 = (int)-1738604884L ^ 0x985EFEEC;
                    break;
                }
                case 170: {
                    n6 = (int)((long)1381230071 ^ (long)1381229976);
                    break;
                }
                case 171: {
                    n6 = (int)((long)1719760170 ^ (long)1719760300);
                    break;
                }
                case 172: {
                    n6 = (int)((long)927401700 ^ (long)927401524);
                    break;
                }
                case 173: {
                    n6 = (int)((long)-96483969 ^ (long)-96483877);
                    break;
                }
                case 174: {
                    n6 = (int)((long)-682573378 ^ (long)-682573516);
                    break;
                }
                case 175: {
                    n6 = (int)-1029902582L ^ 0xC29CEFC1;
                    break;
                }
                case 176: {
                    n6 = (int)((long)739693846 ^ (long)739693900);
                    break;
                }
                case 177: {
                    n6 = (int)((long)1939296527 ^ (long)1939296691);
                    break;
                }
                case 178: {
                    n6 = (int)((long)1187797916 ^ (long)1187797959);
                    break;
                }
                case 179: {
                    n6 = (int)((long)-626457537 ^ (long)-626457523);
                    break;
                }
                case 180: {
                    n6 = (int)((long)-187120385 ^ (long)-187120557);
                    break;
                }
                case 181: {
                    n6 = (int)-736520491L ^ 0xD4199654;
                    break;
                }
                case 182: {
                    n6 = (int)857386820L ^ 0x331AAF68;
                    break;
                }
                case 183: {
                    n6 = (int)((long)1943594996 ^ (long)1943594772);
                    break;
                }
                case 184: {
                    n6 = (int)((long)-1891245251 ^ (long)-1891245135);
                    break;
                }
                case 185: {
                    n6 = (int)-2103408683L ^ 0x82A08762;
                    break;
                }
                case 186: {
                    n6 = (int)((long)707140629 ^ (long)707140728);
                    break;
                }
                case 187: {
                    n6 = (int)47305544L ^ 0x2D1D391;
                    break;
                }
                case 188: {
                    n6 = (int)((long)-405557309 ^ (long)-405557399);
                    break;
                }
                case 189: {
                    n6 = (int)1257945734L ^ 0x4AFABAE7;
                    break;
                }
                case 190: {
                    n6 = (int)-1488468143L ^ 0xA747C7C2;
                    break;
                }
                case 191: {
                    n6 = (int)((long)1051652633 ^ (long)1051652640);
                    break;
                }
                case 192: {
                    n6 = (int)((long)1798950635 ^ (long)1798950428);
                    break;
                }
                case 193: {
                    n6 = (int)-537482633L ^ 0xDFF6AA67;
                    break;
                }
                case 194: {
                    n6 = (int)-1027528535L ^ 0xC2C128ED;
                    break;
                }
                case 195: {
                    n6 = (int)((long)947565194 ^ (long)947565217);
                    break;
                }
                case 196: {
                    n6 = (int)-1574328580L ^ 0xA229A6D5;
                    break;
                }
                case 197: {
                    n6 = (int)((long)-1288054467 ^ (long)-1288054507);
                    break;
                }
                case 198: {
                    n6 = (int)((long)-1020523209 ^ (long)-1020523230);
                    break;
                }
                case 199: {
                    n6 = (int)78099818L ^ 0x4A7B52D;
                    break;
                }
                case 200: {
                    n6 = (int)((long)1992622501 ^ (long)1992622369);
                    break;
                }
                case 201: {
                    n6 = (int)((long)2030424504 ^ (long)2030424330);
                    break;
                }
                case 202: {
                    n6 = (int)((long)1273953225 ^ (long)1273953212);
                    break;
                }
                case 203: {
                    n6 = (int)((long)2115351999 ^ (long)2115351977);
                    break;
                }
                case 204: {
                    n6 = (int)-1550276591L ^ 0xA398A895;
                    break;
                }
                case 205: {
                    n6 = (int)-1740530592L ^ 0x98419C2C;
                    break;
                }
                case 206: {
                    n6 = (int)10546803L ^ 0xA0EEC8;
                    break;
                }
                case 207: {
                    n6 = (int)909537738L ^ 0x36367124;
                    break;
                }
                case 208: {
                    n6 = (int)1967782977L ^ 0x7549FCC9;
                    break;
                }
                case 209: {
                    n6 = (int)((long)831257510 ^ (long)831257432);
                    break;
                }
                case 210: {
                    n6 = (int)-1155815736L ^ 0xBB1BA624;
                    break;
                }
                case 211: {
                    n6 = (int)-1211941503L ^ 0xB7C33D59;
                    break;
                }
                case 212: {
                    n6 = (int)((long)-677286111 ^ (long)-677286085);
                    break;
                }
                case 213: {
                    n6 = (int)((long)372955117 ^ (long)372954984);
                    break;
                }
                case 214: {
                    n6 = (int)((long)295704589 ^ (long)295704702);
                    break;
                }
                case 215: {
                    n6 = (int)-2097828823L ^ 0x82F5ACDE;
                    break;
                }
                case 216: {
                    n6 = (int)993791848L ^ 0x3B3C0FC8;
                    break;
                }
                case 217: {
                    n6 = (int)((long)1138271278 ^ (long)1138271312);
                    break;
                }
                case 218: {
                    n6 = (int)((long)1126105835 ^ (long)1126105688);
                    break;
                }
                case 219: {
                    n6 = (int)((long)356534065 ^ (long)356534188);
                    break;
                }
                case 220: {
                    n6 = (int)-885307457L ^ 0xCB3B4779;
                    break;
                }
                case 221: {
                    n6 = (int)((long)1358797534 ^ (long)1358797555);
                    break;
                }
                case 222: {
                    n6 = (int)((long)949011031 ^ (long)949010947);
                    break;
                }
                case 223: {
                    n6 = (int)((long)-26049280 ^ (long)-26049218);
                    break;
                }
                case 224: {
                    n6 = (int)((long)-1976950946 ^ (long)-1976950785);
                    break;
                }
                case 225: {
                    n6 = (int)704873615L ^ 0x2A03845F;
                    break;
                }
                case 226: {
                    n6 = (int)((long)172439805 ^ (long)172439642);
                    break;
                }
                case 227: {
                    n6 = (int)1076964955L ^ 0x40312EB4;
                    break;
                }
                case 228: {
                    n6 = (int)-1674057817L ^ 0x9C37E7FF;
                    break;
                }
                case 229: {
                    n6 = (int)((long)1037796127 ^ (long)1037796137);
                    break;
                }
                case 230: {
                    n6 = (int)((long)-1416745296 ^ (long)-1416745425);
                    break;
                }
                case 231: {
                    n6 = (int)((long)-684370853 ^ (long)-684370864);
                    break;
                }
                case 232: {
                    n6 = (int)858202605L ^ 0x332721CC;
                    break;
                }
                case 233: {
                    n6 = (int)((long)-1027925319 ^ (long)-1027925283);
                    break;
                }
                case 234: {
                    n6 = (int)((long)-984849243 ^ (long)-984849183);
                    break;
                }
                case 235: {
                    n6 = (int)-571944804L ^ 0xDDE8D0B0;
                    break;
                }
                case 236: {
                    n6 = (int)331845750L ^ 0x13C79094;
                    break;
                }
                case 237: {
                    n6 = (int)-1382953402L ^ 0xAD91CE4B;
                    break;
                }
                case 238: {
                    n6 = (int)((long)515545231 ^ (long)515545204);
                    break;
                }
                case 239: {
                    n6 = (int)((long)-55370976 ^ (long)-55370769);
                    break;
                }
                case 240: {
                    n6 = (int)((long)-400334934 ^ (long)-400334913);
                    break;
                }
                case 241: {
                    n6 = (int)((long)833019082 ^ (long)833018949);
                    break;
                }
                case 242: {
                    n6 = (int)-1100378383L ^ 0xBE698ECF;
                    break;
                }
                case 243: {
                    n6 = (int)-1165384796L ^ 0xBA89A310;
                    break;
                }
                case 244: {
                    n6 = (int)((long)-562790973 ^ (long)-562791014);
                    break;
                }
                case 245: {
                    n6 = (int)((long)98250471 ^ (long)98250355);
                    break;
                }
                case 246: {
                    n6 = (int)59920010L ^ 0x3924EE2;
                    break;
                }
                case 247: {
                    n6 = (int)-1739305790L ^ 0x98544C86;
                    break;
                }
                case 248: {
                    n6 = (int)257020162L ^ 0xF51D1AF;
                    break;
                }
                case 249: {
                    n6 = (int)-1262288359L ^ 0xB4C302E6;
                    break;
                }
                case 250: {
                    n6 = (int)-1164515255L ^ 0xBA96E8F7;
                    break;
                }
                case 251: {
                    n6 = (int)-409400413L ^ 0xE7990B60;
                    break;
                }
                case 252: {
                    n6 = (int)((long)-923513194 ^ (long)-923513176);
                    break;
                }
                case 253: {
                    n6 = (int)((long)333121090 ^ (long)333121246);
                    break;
                }
                case 254: {
                    n6 = (int)((long)40715276 ^ (long)40715399);
                    break;
                }
                default: {
                    n6 = (int)1637303556L ^ 0x61974508;
                }
            }
           // System.out.println(n6);
            char c1 = cArray[i];
            int n9 = n6;
            int n10 = (-n + ((int)1570931923L ^ 0xA25D7B2C) | n9 ^ (int)((long)-952169862 ^ (long)952169861)) - (n9 ^ (int)((long)-105608109 ^ (long)105608108));
            int n11 = n10 + ((-n9 + ((int)1595584934L ^ 0xA0E54E59) | n ^ (int)((long)-656256665 ^ (long)656256664)) - (n ^ (int)((long)-105686470 ^ (long)105686469)) & (n10 ^ (int)((long)823568404 ^ (long)-823568405)));
            int n12 = (-c1 + (int)((long)-1572251462 ^ (long)1572251461) | n11 ^ (int)((long)-487149030 ^ (long)487149029)) - (n11 ^ ((int)-975299956L ^ 0x3A21E573));
            cArray2[i] = (char)(n12 + ((-n11 + ((int)945246749L ^ 0xC7A8ADE2) | c1 ^ (int)((long)2144674601 ^ (long)-2144674602)) - (c1 ^ (int)((long)-997712495 ^ (long)997712494)) & (n12 ^ (int)((long)-968332259 ^ (long)968332258))));
        }
        return new String(cArray2);
    }

    @Override
    public void transform(Deobfuscator deobfuscator) throws Exception {
        for (ClassNode cn : deobfuscator.classes()) {
            for (MethodNode method : cn.methods) {
                ArrayList<AbstractInsnNode> removeNodes = new ArrayList<>();
                for (AbstractInsnNode insn : method.instructions.toArray()) {
                    if (isString(insn) && insn.getNext() instanceof MethodInsnNode) {
                        if (((MethodInsnNode) insn.getNext()).owner.equals("a/2j") && ((MethodInsnNode) insn.getNext()).name.equals("2")) {
                            System.out.println(getString(insn) + " = " + deString(getString(insn),1297));
                            System.out.println();
                            removeNodes.add(insn.getNext());
                            method.instructions.set(insn, new LdcInsnNode(deString(getString(insn),1297)));
                        } else if (((MethodInsnNode) insn.getNext()).owner.equals("a/2k") && ((MethodInsnNode) insn.getNext()).name.equals("2")) {
                            System.out.println("2k  " + getString(insn) + " = " + deString(getString(insn),1300));
                            System.out.println();
                            removeNodes.add(insn.getNext());
                            method.instructions.set(insn, new LdcInsnNode(deString(getString(insn),1300)));
                        }
                    }
                }
                for (AbstractInsnNode abstractInsnNode : method.instructions.toArray()) {
                    if (removeNodes.contains(abstractInsnNode)) {
                        method.instructions.remove(abstractInsnNode);
                    }
                }
            }
        }
    }
}
