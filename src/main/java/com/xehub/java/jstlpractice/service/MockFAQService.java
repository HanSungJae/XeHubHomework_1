package com.xehub.java.jstlpractice.service;

import com.xehub.java.jstlpractice.dto.FAQDto;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class MockFAQService implements FAQService {

    public List<FAQDto> getFAQList() {
        List<FAQDto> dataList = new ArrayList<>();
        dataList.add(new FAQDto(
            "전자 서명은 어떻게 만드나요?",
            "<p>전자 서명은 다양한 방식으로 만들 수 있습니다. 예를 들어, 마우스 커서나 손가락, 스타일러스 펜으로 서명을 그려도 되고, 종이에 한 서명 이미지를 업로드한 후 PNG 형식으로 변환해 문서 서명란에 삽입할 수도 있죠. 또한, 키보드로 입력한 후 원하는 글꼴을 적용할 수도 있습니다.</p><p><a href=\"https://ko.hellosign.com/what-is-hellosign/how-to-create-electronic-signatures\" da-category=\"textlink-click\" da-action=\"/what-is-hellosign/electronic-signatures\" da-label=\"ko.hellosign.com/what-is-hellosign/how-to-create-electronic-signatures\">여기에서 HelloSign으로 전자 서명 만드는 방법</a>을 살펴보세요.</p>"
        ));
        dataList.add(new FAQDto(
            "전자 서명은 합법인가요?",
            "<p>전자 서명은 종이에 한 서명과 똑같은 법적 구속력을 발휘합니다. 전자 서명은 미국 전자서명법 ESIGN(2000)을 비롯해 전 세계 다양한 법률과 규정에 의거해 그 합법성을 인정받고 있습니다. HelloSign은 진위성과 합법성을 갖춘 전자 서명이 필요한 유럽, 아시아 등지의 수많은 고객이 사용하는 전자 서명 솔루션입니다.</p>"
        ));

        // 의도된 Null - 삭제하지 말 것
        dataList.add(null);
        dataList.add(new FAQDto(
            null,
            null
        ));

        dataList.add(new FAQDto(
            "전자 서명은 무료인가요?",
            "<p>HelloSign 무료 계정을 만들면 전자 서명 기능을 매달 3번까지 무료로 사용할 수 있습니다. Pro 이상의 요금제에 가입할 경우 전자 서명 기능을 무제한으로 사용할 수 있죠. 계정을 만들려면 <a href=\"https://app.hellosign.com/account/signUp?_ga=2.63755695.105447811.1615806234-483497401.1615806234\" target=\"_blank\" da-category=\"textlink-click\" da-action=\"/what-is-hellosign/electronic-signatures\" da-label=\"app.hellosign.com/account/signUp?_ga=2.63755695.105447811.1615806234-483497401.1615806234\">여기를 클릭</a>하세요.</p>"
        ));

        return dataList;
    }

}
