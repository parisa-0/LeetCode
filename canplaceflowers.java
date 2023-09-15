class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
         if(flowerbed.length == 1 && n == 0 || (flowerbed.length == 1 && flowerbed[0] == 0 && n==1)) {
                        return true;
                    }
                    else if((flowerbed.length == 1 && flowerbed[0] == 1 && n==1) || flowerbed == null || flowerbed.length < 1) {
                        return false;
                    }

                    if(flowerbed[0] == 0 && flowerbed[1] == 0) {
                        n--;
                        flowerbed[0] = 1;
                    }

                    if(flowerbed.length > 1 && flowerbed[flowerbed.length - 2] == 0 &&
                            flowerbed[flowerbed.length - 1] == 0) {
                        n--;
                        flowerbed[flowerbed.length - 1] = 1;
                    }

                    for (int i = 0; i < flowerbed.length - 1; i++) {
                        if (n <= 0) {
                            break;
                        }
                        else if (i > 0 && (flowerbed[i - 1] == 0 && flowerbed[i] == 0 &&
                                flowerbed[i + 1] == 0) && i <= flowerbed.length - 2) {
                            n--;
                            flowerbed[i] = 1;
                        }
                    }

                    if(n <= 0) {
                        return true;
                    }
                    else {
                        return false;
                    }
        
    }
}
