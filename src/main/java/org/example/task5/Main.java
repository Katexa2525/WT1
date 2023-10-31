package org.example.task5;

public class Main {
        public static void main(String[] args) {
            int[] a = {5, 10, 6, 12, 3, 24, 7, 8};
            System.out.println(kElem(a));
        }

        public static int kElem(int[] arr) {
            int[] k = new int[arr.length];
            for (int i = 0; i < arr.length; i++) {
                k[i] = 1;
                for (int j = 0; j < i; j++) {
                    if (arr[i] > arr[j]) {
                        k[i] = Math.max(k[i], k[j] + 1);
                    }
                }
            }

            int e = k[0];
            for (int i = 1; i < arr.length; i++) {
                e = Math.max(e, k[i]);
            }
            return arr.length - e;
        }
    }


