package uas;

public class coba1 {

    private static int[][] stack = new int[5][5];
    private static String[][] obj = new String[5][5];

    private static void createStack(int a, String b) {
        int alpha = a;
        String beta = b;
        if (stack[0][4] == 0) {
            for (int j = 0; j < stack.length; j++) {
                if (stack[0][j] == 0) {
                    stack[0][j] = alpha;
                    obj[0][j] = beta;
                    break;
                }
            }
        } else if (stack[3][4] > 0) {
            for (int j = 0; j < stack.length; j++) {
                if (stack[4][j] == 0) {
                    stack[4][j] = alpha;
                    obj[4][j] = beta;
                    break;
                }
            }
        } else if (stack[2][4] > 0) {

            for (int j = 0; j < stack.length; j++) {
                if (stack[3][j] == 0) {
                    stack[3][j] = alpha;
                    obj[3][j] = beta;
                    break;
                }
            }
        } else if (stack[1][4] != 0) {
            try {

                for (int j = 0; j < stack.length; j++) {
                    if (stack[2][j] == 0) {
                        stack[2][j] = alpha;
                        obj[2][j] = beta;
                        break;
                    }
                }
            } catch (Exception e) {
                System.out.println(e);
            }

        } else if (stack[0][4] != 0) {

            for (int j = 0; j < stack.length; j++) {
                if (stack[1][j] == 0) {
                    stack[1][j] = alpha;
                    obj[1][j] = beta;
                    break;
                }
            }
        }
    }

//    private static void selection_sort() {
//        int i, j, pos;
//        for (i = 0; i < row - 1; i++) {
//            pos = i;
//
//            for (j = i + 1; j < row; j++) {
//                if (stack[j] < stack[pos]) {
//                    pos = j;
//                }
//            }
//            if (pos != i) {
//                tukar(pos, i);
//            }
//        }
//    }
//
//    private static void tukar(int a, int b) {
//        int temp = stack[a];
//        stack[a] = stack[b];
//        stack[b] = temp;
//        String temp1 = obj[a];
//        obj [a] = obj [b];
//        obj [b] = temp1;
//    }
//
    private static void removeStack() {

        if (stack[4][0] > 0) {
            for (int i = 4; i >= 0; i--) {
                for (int j = 4; j >= 0; j--) {
                    if (stack[i][j] != 0) {
                        stack[i][j] = 0;
                        obj[i][j] = null;
                        break;
                    }
                }
                break;
            }
            System.out.println("Data terakhir sudah dikeluarkan");
        } else if (stack[3][0] > 0) {
            for (int i = 3; i >= 0; i--) {
                for (int j = 4; j >= 0; j--) {
                    if (stack[i][j] != 0) {
                        stack[i][j] = 0;
                        obj[i][j] = null;
                        break;
                    }
                }
                break;
            }
            System.out.println("Data terakhir sudah dikeluarkan");
        } else if (stack[2][0] > 0) {
            for (int i = 2; i >= 0; i--) {
                for (int j = 4; j >= 0; j--) {
                    if (stack[i][j] != 0) {
                        stack[i][j] = 0;
                        obj[i][j] = null;
                        break;
                    }
                }
                break;
            }
            System.out.println("Data terakhir sudah dikeluarkan");
        } else if (stack[1][0] > 0) {
            for (int i = 1; i >= 0; i--) {
                for (int j = 4; j >= 0; j--) {
                    if (stack[i][j] != 0) {
                        stack[i][j] = 0;
                        obj[i][j] = null;
                        break;
                    }
                }
                break;
            }
            System.out.println("Data terakhir sudah dikeluarkan");
        } else if (stack[0][0] > 0) {
            for (int i = 0; i >= 0; i--) {
                for (int j = 4; j >= 0; j--) {
                    if (stack[i][j] != 0) {
                        stack[i][j] = 0;
                        obj[i][j] = null;
                        break;
                    }
                }
                break;
            }
            System.out.println("Data terakhir sudah dikeluarkan");
        }
    }
    
    private static void removerow(){
        if (stack[4][0] > 0) {
            for (int i = 4; i >= 0; i--) {
                for (int j = 4; j >= 0; j--) {
                    if (stack[i][j] != 0) {
                        stack[i][j] = 0;
                        obj[i][j] = null;
                    }
                }
                break;
            }
            System.out.println("Data terakhir sudah dikeluarkan");
        } else if (stack[3][0] > 0) {
            for (int i = 3; i >= 0; i--) {
                for (int j = 4; j >= 0; j--) {
                    if (stack[i][j] != 0) {
                        stack[i][j] = 0;
                        obj[i][j] = null;
                    }
                }
                break;
            }
            System.out.println("Data terakhir sudah dikeluarkan");
        } else if (stack[2][0] > 0) {
            for (int i = 2; i >= 0; i--) {
                for (int j = 4; j >= 0; j--) {
                    if (stack[i][j] != 0) {
                        stack[i][j] = 0;
                        obj[i][j] = null;
                    }
                }
                break;
            }
            System.out.println("Data terakhir sudah dikeluarkan");
        } else if (stack[1][0] > 0) {
            for (int i = 1; i >= 0; i--) {
                for (int j = 4; j >= 0; j--) {
                    if (stack[i][j] != 0) {
                        stack[i][j] = 0;
                        obj[i][j] = null;
                    }
                }
                break;
            }
            System.out.println("Data terakhir sudah dikeluarkan");
        } else if (stack[0][0] > 0) {
            for (int i = 0; i >= 0; i--) {
                for (int j = 4; j >= 0; j--) {
                    if (stack[i][j] != 0) {
                        stack[i][j] = 0;
                        obj[i][j] = null;
                    }
                }
                break;
            }
            System.out.println("Data terakhir sudah dikeluarkan");
        }
    }
    private static void removecol(){
        if (stack[4][0] > 0) {
            for (int i = 4; i >= 0; i--) {
                for (int j = 4; j >= 0; j--) {
                    if (stack[i][j] != 0) {
                        stack[i][j] = 0;
                        obj[i][j] = null;
                        break;
                    }
                }
            }
            System.out.println("Data terakhir sudah dikeluarkan");
        } else if (stack[3][0] > 0) {
            for (int i = 3; i >= 0; i--) {
                for (int j = 4; j >= 0; j--) {
                    if (stack[i][j] != 0) {
                        stack[i][j] = 0;
                        obj[i][j] = null;
                        break;
                    }
                }
            }
            System.out.println("Data terakhir sudah dikeluarkan");
        } else if (stack[2][0] > 0) {
            for (int i = 2; i >= 0; i--) {
                for (int j = 4; j >= 0; j--) {
                    if (stack[i][j] != 0) {
                        stack[i][j] = 0;
                        obj[i][j] = null;
                        break;
                    }
                }
            }
            System.out.println("Data terakhir sudah dikeluarkan");
        } else if (stack[1][0] > 0) {
            for (int i = 1; i >= 0; i--) {
                for (int j = 4; j >= 0; j--) {
                    if (stack[i][j] != 0) {
                        stack[i][j] = 0;
                        obj[i][j] = null;
                        break;
                    }
                }
            }
            System.out.println("Data terakhir sudah dikeluarkan");
        } else if (stack[0][0] > 0) {
            for (int i = 0; i >= 0; i--) {
                for (int j = 4; j >= 0; j--) {
                    if (stack[i][j] != 0) {
                        stack[i][j] = 0;
                        obj[i][j] = null;
                        break;
                    }
                }
            }
            System.out.println("Data terakhir sudah dikeluarkan");
        }
    }

    private static void cetak() {
        if (stack[4][0] > 0) {
            for (int j = 0; j < 5; j++) {
                for (int i = 0; i < 5; i++) {
                    System.out.print(stack[j][i] + " => " + obj[j][i] + "  ");
                }
                System.out.println("");
            }
            System.out.println(" ");
        } else if (stack[3][0] > 0) {
            for (int j = 0; j < 4; j++) {
                for (int i = 0; i < 5; i++) {
                    System.out.print(stack[j][i] + " => " + obj[j][i] + "  ");
                }
                System.out.println("");
            }
            System.out.println(" ");
        } else if (stack[2][0] > 0) {
            for (int j = 0; j < 3; j++) {
                for (int i = 0; i < 5; i++) {
                    System.out.print(stack[j][i] + " => " + obj[j][i] + "  ");
                }
                System.out.println("");
            }
            System.out.println(" ");
        } else if (stack[1][0] > 0) {
            for (int j = 0; j < 2; j++) {
                for (int i = 0; i < 5; i++) {
                    System.out.print(stack[j][i] + " => " + obj[j][i] + "  ");
                }
                System.out.println("");
            }
            System.out.println(" ");
        } else if (stack[0][0] > 0) {
            for (int j = 0; j < 1; j++) {
                for (int i = 0; i < 5; i++) {
                    System.out.print(stack[j][i] + " => " + obj[j][i] + "  ");
                }
                System.out.println("");
            }
            System.out.println(" ");
        }
    }

    public static void main(String[] args) {
        createStack(3, "a");
        createStack(2, "b");
        createStack(5, "c");
        createStack(4, "d");
        createStack(1, "e");
        createStack(13, "f");
        createStack(12, "g");
        createStack(15, "h");
        createStack(14, "i");
        createStack(11, "j");
        createStack(14, "k");
        createStack(11, "l");
        System.out.println("Data Awal");
        cetak();
//        selection_sort();
//        System.out.println("Data setelah di sortir");
//        cetak();
        removeStack();
        cetak();
        removeStack();
        cetak();
        createStack(14, "m");
        createStack(11, "n");
        cetak();
    }
}
