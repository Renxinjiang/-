package d25;

import java.util.Scanner;

/**
 * @PackageName: d25
 * @ClassName: Class2
 * @Description:
 * 1、中文大写金额数字前应标明“人民币”字样。
 *   壹、贰、叁、肆、伍、陆、柒、捌、玖、拾、佰、仟、万、亿、元、角、分、零、整等字样填写。
 * 2、中文大写金额数字到“元”为止的，在“元”之后，应写“整字，
 * 如￥ 532.00应写成“人民币伍佰叁拾贰元整”。在”角“和”分“后面不写”整字。
 * 3、阿拉伯数字中间有“0”时，中文大写要写“零”字，
 * 阿拉伯数字中间连续有几个“0”时，中文大写金额中间只写一个“零”字，
 * 如￥6007.14，应写成“人民币陆仟零柒元壹角肆分“。
 * 输入描述:
 * 输入一个double数
 * 输出描述:
 * 输出人民币格式
 *
 * 示例1
 * 输入
 * 151121.15
 * 输出
 * 人民币拾伍万壹仟壹佰贰拾壹元壹角伍分
 * @author: 呆呆
 * @date: 2020/3/2
 */
public class Class2 {
    static String[] map = {"壹","贰","叁","肆","伍","陆","柒","捌","玖"};

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){
            String money = scan.next();
            resolve(money);
        }
    }

    public static void resolve(String str){

        String[] strArr = str.split("\\.");
        int money = Integer.valueOf(str.split("\\.")[0]);

        StringBuffer res = new StringBuffer("人民币");
        int yi = (int)(money/100000000);
        if(yi!=0){
            res.append(resolveQian(yi)).append("亿");
            money = money-yi*100000000;
        }

        int wan = (int)(money/10000);
        if(wan!=0){
            res.append(resolveQian(wan)).append("万");
            money = money-wan*10000;
        }

        //处理千百十个位
        String beforePointString = resolveQian(money);
        if(beforePointString.length()>1){
            res.append(beforePointString).append("元");
        }

        //若有小数点，处理小数点后面位数
        if(strArr.length>1){
            String afterPointStr = strArr[1];
            //System.out.println(afterPointStr);
            res.append(handleNumberAfterPoint(afterPointStr));
        }

        //在resolveQian() 方法里可能会返回  零xxx
        //但在最高为不能有"零"
        String resString = res.toString();

        if(resString.length()>4 && resString.charAt(3)=='零' && resString.charAt(4)!='元'){
            //System.out.println(resString.substring(0,3));
            resString = resString.substring(0,3)+resString.substring(4);
        }

        System.out.println(resString);

    }

    //处理4位数 千百十个位
    public static String resolveQian(double temp){

        StringBuffer resBuffer = new StringBuffer();

        //千位
        int qian = (int)(temp/1000);
        if(qian!=0){
            resBuffer.append(map[qian-1]).append("仟");
            temp = temp-qian*1000;
        }

        //百位
        int bai = (int)(temp/100);
        if(bai!=0){
            resBuffer.append(map[bai-1]).append("佰");
            temp = temp-bai*100;
        }
        //注意:零 只会添加在 百位和十位
        if(qian!=0 && bai==0){
            resBuffer.append("零");
        }

        //十位
        int shi = (int)(temp/10);
        if(shi!=0){
            if(shi!=1){
                resBuffer.append(map[shi-1]);
            }
            resBuffer.append("拾");
            temp = temp-shi*10;
        }

        //注意：0
        if(bai!=0&&shi==0){
            resBuffer.append("零");
        }

        //个位
        int ge = (int)(temp%10);


        if(ge!=0){
            //5,0001 这种情况，千百十位均为0
            if(qian==0&&bai==0&&shi==0){
                resBuffer.append("零");
            }
            resBuffer.append(map[ge-1]);
        }
        String res = resBuffer.toString();
        return res;
    }

    //处理小数点后面的数
    public static String handleNumberAfterPoint(String str){
        String res = "";
        if(str.equals("00") ||str.equals("0")){
            res = "整";
        }else{
            if(str.charAt(0)!='0'){
                res += map[Integer.valueOf(str.charAt(0)+"")-1]+"角";
            }
            if(str.length()>1 && str.charAt(1)!='0'){
                res += map[Integer.valueOf(str.charAt(1)+"")-1]+"分";
            }
        }
        return res;
    }
}
