package java_learn_code.no_04_java_type_of_data;
/**
* 前面1-6节总结，代码实践，主要涉及javase基础知识。
* 包含：数据类型、数据类型转换、算术运算符、赋值运算符、比较运算符、逻辑元算符、三元运算符
* 分为1-5部分。
* 2019/10/09
*/
public class BasicDataTypeDemo01{
	public static void main(String[] args){
		//1、记录每种库存商品信息 
		
		//苹果笔记本电脑
		String macBrand = "MacBookAir";
		double macSize = 13.3;
		double macPrice = 6988.88;
		int macCount = 5;

		//联想Thinkpad笔记本电脑
		String thinkpadBrand = "ThinkpadT450";
		double thinkpadSize = 14.0;
		double thinkpadPrice = 5999.99;
		int thinkpadCount = 10;

		//华硕ASUS笔记本电脑
		String ASUSBrand = "ASUS-FL5800";
		double ASUSSize = 15.6;
		double ASUSPrice = 4999.50;
		int ASUSCount = 18;
		
		
		//2、统计所有库存商品数量与金额
		
		//统计库存总个数、库存总金额
		int totalCount = macCount + thinkpadCount + ASUSCount;
		double totalMoney = (macCount * macPrice) + (thinkpadCount * thinkpadPrice) + (ASUSCount * ASUSPrice);

		//3、打印库存清单顶部信息
		
		//列表顶部
		System.out.println("------------------------------商城库存清单-----------------------------");
		System.out.println("品牌型号	尺寸	价格	库存数");
		
		//4、打印库存清单中部信息
		
		//列表中部
		System.out.println(macBrand+"	"+macSize+"	"+macPrice+"	"+macCount);
		System.out.println(thinkpadBrand+"	"+thinkpadSize+"	"+thinkpadPrice+"	"+thinkpadCount);
		System.out.println(ASUSBrand+"	"+ASUSSize+"	"+ASUSPrice+"	"+ASUSCount);

		//5、打印库存清单底部信息
		
		//列表底部
		System.out.println("-----------------------------------------------------------------------");
		System.out.println("总库存数："+totalCount); 
		System.out.println("库存商品总金额："+totalMoney);

	}
}