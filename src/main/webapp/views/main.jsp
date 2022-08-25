<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Homework</title>
    <style>
        body{
            background-color: #dcdcdc;

        }
        .container{
            display: flex;
            flex-wrap: wrap;
            justify-content: center;

        }
        .item{
            flex-basis: 100px;
            flex-grow: 1;
            height: 500px;
            margin: 50px;
        }

        .onlytext{
            margin: 100px 300px 100px;
            text-align: center;
        }
        .title{
            margin: 10px 50px;
            font-size: 32px;
        }
        .text{
            font-size: 16px;
            margin: 15px;
        }
    </style>
</head>
<body>
<div class="container">
    <div class="item" style="background-color: black">
        <div class="text" style="color: white">전자 서명이 간편해지는 HelloSign</div>
    </div>
    <div class="item" style="background-color: #FFE641"></div>
</div>

<div class="onlytext">
    <div class="title">전자 서명이 지닌 강력한 힘</div>
    <div class="text">전자 서명은 특정 문서의 내용에 동의함을 표시하는 전자적 표현을 말합니다. NDA에서부터 판매 계약서,
        청구서, 출퇴근 기록부, 임대차 계약서, 세금 양식까지 생각할 수 있는 모든 유형의 문서에 전자 서명이 가능하죠.
        전자 서명은 미국 전자서명법 ESIGN(2000)에 따라 종이에 한 서명과 똑같은 것으로 그 합법성을 인정받고 있습니다.</div>
</div>

<div class="onlytext">
    <div class="title">유연한 서명과정</div>
    <div class="text">전자 서명 프로세스를 시작하는 가장 첫 단꼐는 바로 전자 서명을 만드는 것입니다. 전자 서명을 만드는
        간편하면서도 다양한 방법을 소개합니다. 어떤 방법으로 제작하더라도 나만의 고유한 전자 서명이 HelloSign 계정에 저장되어
        추후 사용할 수 있죠.<br><br>전자 서명을 만드는 다양한 옵션은 다음과 같습니다.</div>
</div>

<div class="container">
    <div class="item">
        <div class="title">손가락이나 스타일러스펜으로 서명 그리기</div>
        <div class="text">터치스크린 기능이 지원될 경우 손가락을 사용해 문서에서 바로 전자 서명을 만들 수 있습니다.
            이 방법은 모바일 장치나 태블릿을 사용할 때 특히 유용합니다.</div>
    </div>
    <div class="item">
        <img src="images/img1.png">
    </div>
</div>
</body>
</html>

