class Solution {
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            
            // 1. Move 'left' forward if it is NOT a vowel
            while (left < right && arr[left] != 'a' && arr[left] != 'e' && arr[left] != 'i' && arr[left] != 'o' && arr[left] != 'u' &&
                   arr[left] != 'A' && arr[left] != 'E' && arr[left] != 'I' && arr[left] != 'O' && arr[left] != 'U') {
                left++;
            }
            
            // 2. Move 'right' backward if it is NOT a vowel
            while (left < right && arr[right] != 'a' && arr[right] != 'e' && arr[right] != 'i' && arr[right] != 'o' && arr[right] != 'u' &&
                   arr[right] != 'A' && arr[right] != 'E' && arr[right] != 'I' && arr[right] != 'O' && arr[right] != 'U') {
                right--;
            }
            
            // 3. Both are vowels! Swap them.
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            
            // 4. Step both pointers inward
            left++;
            right--;
        }

        // Return the modified character array converted back to a String
        return new String(arr);
    }
}