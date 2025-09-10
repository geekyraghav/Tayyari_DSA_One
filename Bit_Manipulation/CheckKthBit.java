class CheckBit {
    static boolean checkKthBit(int n, int k) {
        return ((n>>k) % 2 == 1);
    }
}
