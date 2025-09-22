package star.domain;

public enum ZodiacSign {
    ARIES,        // 양자리
    TAURUS,       // 황소자리
    GEMINI,       // 쌍둥이자리
    CANCER,       // 게자리
    LEO,          // 사자자리
    VIRGO,        // 처녀자리
    LIBRA,        // 천칭자리
    SCORPIO,      // 전갈자리
    SAGITTARIUS,  // 사수자리
    CAPRICORN,    // 염소자리
    AQUARIUS,     // 물병자리
    PISCES;       // 물고기자리

    /* fromString() 메서드를 추가하여, 문자열을 ZodiacSign으로 변환 */
    public static ZodiacSign fromString(String sign) {
        return switch (sign.toUpperCase()) {
            case "ARIES" -> ARIES;
            case "TAURUS" -> TAURUS;
            case "GEMINI" -> GEMINI;
            case "CANCER" -> CANCER;
            case "LEO" -> LEO;
            case "VIRGO" -> VIRGO;
            case "LIBRA" -> LIBRA;
            case "SCORPIO" -> SCORPIO;
            case "SAGITTARIUS" -> SAGITTARIUS;
            case "CAPRICORN" -> CAPRICORN;
            case "AQUARIUS" -> AQUARIUS;
            case "PISCES" -> PISCES;
            default -> throw new IllegalArgumentException("Invalid ZodiacSign: " + sign);
        };
    }
}
