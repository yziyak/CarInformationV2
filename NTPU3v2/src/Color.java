public enum Color {
    KIRMIZI("Yakut Kırmızısı", 0),
    SARI("Civciv Sarısı", 1),
    MAVI("Gökyüzü Mavisi", 2),
    YESIL("Su Yeşili", 3),
    BEYAZ("İnci Beyazı", 4);

    private final int renkKod;
    private final String avatar;

    Color(String avatar, int renkKod) {
        this.avatar = avatar;
        this.renkKod = renkKod;
    }

    public int getRenkKod() {
        return renkKod;
    }

    public String getAvatar() {
        return avatar;
    }
}
