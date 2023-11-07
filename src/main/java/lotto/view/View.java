package lotto.view;

public class View {
    private static final String INPUT_MONEY = "구입금액을 입력해 주세요.";
    private static final String INPUT_LOTTO_NUMBERS = "당첨 번호를 입력해 주세요.";
    private static final String INPUT_BONUS_NUMBERS = "보너스 번호를 입력해 주세요.";

    private static final String OUTPUT_PURCHASED_LOTTO_NUMBERS = "개를 구매했습니다.";

    public void request_InputMoney(){
        System.out.println(INPUT_MONEY);
    }

    public void request_InputLottoNumbers(){
        System.out.println(INPUT_LOTTO_NUMBERS);
    }

    public void request_InputBonusNumbers(){
        System.out.println(INPUT_BONUS_NUMBERS);
    }


    public void outputPurchasedLottoNumbers(int purchasedLottoNum){
        System.out.println(purchasedLottoNum + OUTPUT_PURCHASED_LOTTO_NUMBERS);
    }


}
