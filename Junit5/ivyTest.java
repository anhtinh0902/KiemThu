package ivymoda;

public class ivyTest {
    //test 1
    public static String TestHo(String a){
        if (a.length()<0){
           System.out.print("Ban phai nhap ho");
        }
        return a;
    }
    //test 2
    public static String TestTen(String a){
        if (a.length()<0){
            System.out.print("Ban phai nhap ten");
        }
        return a;
    }
    //test 3
    public static String TestPassword(String a){
        if (a.length()<0){
            System.out.print("Ban phai nhap mat khau");
        }
        return a;
    }
    //test 4
    public static String TestPasswordLength(String a){
        if (a.length()<5){
            System.out.print("Mat khau phai lon hon 5 ky tu");
        }
        return a;
    }
    //test 5
    public static String TestNumberPhoneLength(String a){
        if (a.length()<9 && a.length()>11){
            System.out.print("So dien thoai co chieu dai tu 9-11 ky tu");
        }
        return a;
    }
    //test 6
    public static String TestNumberPhone(String a){
        if (a.length()<0){
            System.out.print("Ban phai nhap so dien thoai");
        }
        return a;
    }
    //test 7
    public static String TestBirtday(String a){
        if (a.length()<0){
            System.out.print("Ban phai nhap ngay sinh");
        }
        return a;
    }
    //test 8
    public static String TestProvince(String a){
        if (a.length()<0){
            System.out.print("Ban phai nhap tinh ban song");
        }
        return a;
    }
    //test 9
    public static String TestDistrict(String a){
        if (a.length()<0){
            System.out.print("Ban phai nhap quan/huyen ban song");
        }
        return a;
    }
    //test 10
    public static String TestWards(String a){
        if (a.length()<0){
            System.out.print("Ban phai nhap xa/phuong ban song");
        }
        return a;
    }
    //test 11
    public static String TestAddress(String a){
        if (a.length()<0){
            System.out.print("Ban phai nhap dia chi ban song");
        }
        return a;
    }
}
