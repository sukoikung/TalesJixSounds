package com.example.myprobeta1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class TaleActivity extends AppCompatActivity {
    DataTale b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20;


    private TextView order;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tale);


        b1 = new DataTale();
        b1.setName(" กระต่ายกับเต่า ");
        b1.setLmage((int)R.drawable.b1);
        b1.setName1("เรื่องมีอยู่ว่า");
        b1.setData1("วันหนึ่ง กระต่ายป่าหัวเราะเต่าว่าขาสั้นและเดินเชื่องช้า เมื่อเต่าได้ยินจึงท้าทายกลับไปว่า ถึงเจ้าจะวิ่งเร็ว แต่ข้าคิดว่าถ้าเราลองมาแข่งกัน ข้าจะต้องเอาชนะเจ้าได้แน่\n" +
                "แต่กระต่ายป่ากลับมั่นใจว่าเต่าไม่มีทางเอาชนะมันได้แน่นอน มันจึงตอบตกลง โดยให้สุนัขจิ้งจอกมาเป็นผู้ตัดสิน เมื่อถึงวันแข่งขัน กระต่ายป่ากับเต่าก็มาวิ่งแข่งกัน\n" +
                "เต่าค่อย ๆ เดินอย่างเชื่องช้า แต่สม่ำเสมอและไม่หยุดพัก ส่วนกระต่ายป่าวิ่งนำเต่าไปมาก ก็ชะล่าใจคิดว่าถ้างีบหลับสักครู่เต่าก็คงยังตามไม่ทัน จนเวลาผ่านไปกระต่ายป่าสะดุ้งตื่น มองซ้าย มองขวาไม่เห็นเต่า\n" +
                " จึงรีบวิ่งอย่างสุดแรงแต่ก็ช้าไปเสียแล้ว เต่าได้มาถึงเส้นชัยก่อนและกำลังนอนพักผ่อนอย่างสบาย");
        b1.setName2("นิทานเรื่องนี้สอนให้รู้ว่า");
        b1.setData2("ความพยายามอยู่ที่ไหน ความสำเร็จอยู่ที่นั่น");
        b1.setCredit("credit: http://www.kalyanamitra.org/th/Aesop_detail.php?page=4129");

        b2 = new DataTale();
        b2.setName("กากับเชือก");
        b2.setLmage((int)R.drawable.b2);
        b2.setName1("เรื่องมีอยู่ว่า");
        b2.setData1("นายพรานจับกาได้ตัวหนึ่ง เขาจึงใช้เชือกผูกขาของมันไว้ แล้วหิ้วกลับไปฝากลูก ๆ กาฉวยโอกาสตอนที่\n" +
                "ลูกนายพรานเผลอแอบบินหนีไป เมื่อมันบินหนีมาจนใกล้จะถึงรัง เชือกที่นายพรานผูกขามันไว้ไปพันเช้ากับกิ่ง\n" +
                "ไม้ มันดิ้นเท่าไหร่เชือกก็ไม่หลุด ขณะที่มันกำลังจะตาย มันได้แต่บ่นกับตนเองว่า ข้านี่มันโง่จริง ๆ หนีจาก\n" +
                "การเป็นทาสรับใช้มนุษย์มาได้แล้ว แต่กลับต้องมาตายเพราะความซุ่มซ่ามของตัวเองแท้ ๆ");
        b2.setName2("นิทานเรื่องนี้สอนให้รู้ว่า");
        b2.setData2("ควรใช้สติในการแก้ปัญหา");
        b2.setCredit("credit: http://www.kalyanamitra.org/th/Aesop_detail.php?page=4117");

        b3 = new DataTale();
        b3.setName("หนูในหีบ");
        b3.setLmage((int)R.drawable.b3);
        b3.setName1("เรื่องมีอยู่ว่า");
        b3.setData1("หนูตัวหนึ่งใช้ชีวิตอย่างสุขสบายในหีบที่เต็มไปด้วยอาหาร มันไม่เคยออกมาเห็นโลกภายนอกเลย\n" +
                "จนกระทั่งวันหนึ่งฝาหีบถูกเปิดออก มันจึงรีบปีนขึ้นไปด้วยความอยากรู้อยากเห็น\n" +
                "แต่พลาดตกออกไปข้างนอกหีบ มันพยายามปีนกลับเข้าไปในหีบอยู่หลายครั้ง แต่ก็ตกลงมาทุกครั้ง จนมันหมดแรง\n" +
                "ทันใดนั้นเองมันเหลือบไปเห็นอาหารที่มีอยู่มากมาย มันจึงพูดกับตัวเองอย่างมีความสุขว่า\n" +
                "ข้าจะกลับไปอยู่ในหีบแคบ ๆ ใบนั้นทำไมนะ ในเมื่อข้างนอกออกจะกว้างใหญ่แถมยังมีอาหารมากมายอีกด้วย");
        b3.setName2("นิทานเรื่องนี้สอนให้รู้ว่า");
        b3.setData2("อย่าปิดกั้นตัวเองให้อยู่ในโลกแคบ ๆ จงเปิดใจกว้างยอมรับและเรียนรู้สิ่งใหม่ ๆ");
        b3.setCredit("credit: http://www.kalyanamitra.org/th/Aesop_detail.php?page=4171");

        b4 = new DataTale();
        b4.setName("วัวสี่ตัวกับราชสีห์");
        b4.setLmage((int)R.drawable.b4);
        b4.setName1("เรื่องมีอยู่ว่า");
        b4.setData1("เรื่องมีอยู่ว่า ราชสีห์ตัวหนึ่งมักจะเข้าไปหากินบริเวณทุ่งหญ้า ซึ่งเป็นที่อยู่อาศัยของวัวทั้ง 4 บ่อยครั้ง\n" +
                "ที่ราชสีห์พยายามเข้าจู่โจมพวกวัว แต่เมื่อไดก็ตามที่มันเข้าใกล้ วัวทั้ง 4 จะหันหางเข้าหากัน ดังนั้นไม่ว่า\n" +
                "ราชสีห์จะวิ่งไปทางไหนก็หนีไม่พ้นเขาของพวกวัว\n" +
                "ราชสีห์จึงไปพูดยุแหย่วัวทีละตัวเพื่อให้มันแตกคอกัน พวกเพื่อนของเจ้าหน่ะไปพูดกับวัวตัวอื่น \n" +
                "หาว่าเจ้าอ่อนแอเป็นตัวถ่วง ต้องคอยปกป้องอยู่ตลอด ราชสีห์พูดแบบนี้กับวัวทุกตัว จนกระทั่งวันหนึ่งวัว\n" +
                "ทั้ง 4 เกิดทะเลาะกันและก็แยกย้ายกันไป ราชสีห์จึงใช้โอกาสนี้จับวัวกินเป็นอาหารได้อย่างสะดวก");
        b4.setName2("นิทานเรื่องนี้สอนให้รู้ว่า");
        b4.setData2("รวมกันเราอยู่ แยกหมู่เราตาย");
        b4.setCredit("credit: http://www.kalyanamitra.org/th/Aesop_detail.php?page=2248");

        b5 = new DataTale();
        b5.setName("กวางกับเสือ");
        b5.setLmage((int)R.drawable.b5);
        b5.setName1("เรื่องมีอยู่ว่า");
        b5.setData1("กวางตัวหนึ่งหนีการตามล่าของนายพราน กระโจนเผ่นหนีไปอย่างไม่คิดชีวิต เมื่อพบถ้ำแห่งหนึ่งก็\n" +
                "ลนลานรีบเข้าไปหลบซ่อน โดยไม่ทันได้สำรวจให้ดีเสียก่อน ขณะนั้นเสือตัวหนึ่งกำลังนอนหลับอยู่ในถ้ำ\n" +
                "ได้ยินเสียงฝีเท้าของกวางก็สะดุ้งตื่น มันเห็นกวางเดินตื่นกลัวเข้ามา เสือโคร่งก็แสยะยิ้มแยกเขี้ยว\n" +
                "นึกในใจว่า โอ้โห! วันนี้โชคดีจริง ๆ จู่ ๆ ก็มีเหยื่อมาให้ขย้ำกินถึงที่ \n" +
                "เสือโคร่งหมอบซุ่มรอให้กวางเดินเข้ามาใกล้ ๆ แล้วกระโจนเข้าตะปบกวางโชคร้าย กินเป็นอาหารได้อย่างง่ายดาย");
        b5.setName2("นิทานเรื่องนี้สอนให้รู้ว่า");
        b5.setData2("จงมีสติ พิจารณาให้รอบคอบก่อนเสมอ");
        b5.setCredit("credit: http://www.kalyanamitra.org/th/Aesop_detail.php?page=4568");

        b6 = new DataTale();
        b6.setName("วัวกับแพะ");
        b6.setLmage((int)R.drawable.b6);
        b6.setName1("เรื่องมีอยู่ว่า");
        b6.setData1("กาลครั้งหนึ่งนานมาแล้ว…มีวัวตัวหนึ่งกำลังหนีการไล่ล่าของราชสีห์ มันวิ่งมาจนถึงปากถ้ำแห่งหนึ่ง\n" +
                "จึงคิดจะเข้าไปอาศัยซ่อนตัวในนั้น โดยไม่รู้ว่ามีแพะตัวหนึ่งอาศัยอยู่ในถ้ำนั้นก่อนแล้ว\n" +
                "เจ้าแพะเห็นวัวกำลังจะเข้ามามันจึงกระโจนออกมาขวางพร้อมกับขู่ไม่ให้วัวเข้าไปข้างใน\n" +
                "อย่าเข้ามานะ ถ้าเจ้าเข้ามา ข้าขวิดเจ้าท้องแตกแน่ๆ\n" +
                "เจ้าวัวโมโหมาก อยากจะสั่งสอนเจ้าแพะ แต่เมื่อนึกขึ้นได้ว่าราชสีห์กำลังตามล่าอยู่จึงเลิกคิดตอแยกับแพะ แล้วพูดก่อนที่จะเดินจากไปว่า\n" +
                "หน็อยแน่ เจ้าแพะ! อย่าเข้าใจผิดว่าที่ข้าจากไปเพราะกลัวเจ้าหรอกนะ ถ้าข้าไม่ต้องหนีเอา ชีวิตรอดแล้วละก็ ข้าจะสั่งสอนให้เจ้ารู้ฤทธิ์เดชของข้าเสียบ้าง");
        b6.setName2("นิทานเรื่องนี้สอนให้รู้ว่า");
        b6.setData2("จงเลือกเอาตัวรอดดีกว่ามาทะเลาะกับคนพาล");
        b6.setCredit("credit: http://www.kalyanamitra.org/th/Aesop_detail.php?page=4544");

        b7 = new DataTale();
        b7.setName("ต้นโอ๊กกับต้นอ้อ");
        b7.setLmage((int)R.drawable.b7);
        b7.setName1("เรื่องมีอยู่ว่า");
        b7.setData1("วันหนึ่งเกิดลมพายุใหญ่พัดกระหน่ำรุนแรงไปทั่วทั้งป่า ต้นโอ๊กต้นหนึ่งไม่อาจต้านแรงลมไหว\n" +
                "จึงโค่นลงมาแบบถอนรากถอนโคน แต่ต้นอ้อเล็กๆ ที่อยู่ข้างๆ กลับไม่เป็นอะไรเลย ต้นโอ๊กแปลกใจมากจึงถามต้นอ้อว่า\n" +
                "พวกเจ้าเป็นเพียงแค่ต้นไม้เล็กๆ ที่บอบบางและอ่อนแอ แต่ทำไมเวลาโดนพายุ พวกเจ้าถึงไม่เป็นอะไรเลย\n" +
                "ต้นอ้อจึงตอบว่า\n" +
                "ก็เพราะท่านทำตัวแข็งต้านกระแสลม ท่านจึงโค่นล้มได้ง่าย แต่พวกเราโอนอ่อนไปตามแรงลม จึงรอดพ้นจากพายุในครั้งนี้มาได้โดยไม่ได้รับอันตรายใดๆ ยังไงล่ะ");
        b7.setName2("นิทานเรื่องนี้สอนให้รู้ว่า");
        b7.setData2("ผู้อ่อนน้อมย่อมสามารถอยู่รอดได้ดีกว่าผู้ที่แข็งกร้าว");
        b7.setCredit("credit: http://www.kalyanamitra.org/th/Aesop_detail.php?page=4530");

        b8 = new DataTale();
        b8.setName("กบสองตัว");
        b8.setLmage((int)R.drawable.b8);
        b8.setName1("เรื่องมีอยู่ว่า");
        b8.setData1("ณ หนองน้ำแห่งหนึ่ง มีกบสองตัวอาศัยอยู่ใกล้ ๆ กัน ตัวหนึ่งอาศัยอยู่ในหนองน้ำลึก ส่วนอีกตัวอาศัย\n" +
                "อยู่ในแอ่งน้ำตื้นใกล้ทางเกวียน วันหนึ่งเจ้ากบในหนองน้ำลึกพูดกับเพื่อนของมันว่า ข้าว่าตรงนั้นไม่ค่อย\n" +
                "ปลอดภัยนะ เจ้าย้ายมาอยู่กับข้าน่าจะดีกว่า แต่กบอีกตัวปฏิเสธว่า ไม่เป็นไรหรอกข้าชินกับแอ่งน้ำนี้\n" +
                "แล้ว และอีกอย่างข้าไม่อยากต้องไปปรับตัวกับที่ใหม่ด้วย หลังจากนั้นไม่กี่วันต่อมา เจ้ากบที่อยู่ในหนอง\n" +
                "น้ำลึกก็ได้รับข่าวร้ายว่าเพื่อนของมันถูกเกวียนทับตายไปเสียแล้ว");
        b8.setName2("นิทานเรื่องนี้สอนให้รู้ว่า");
        b8.setData2("บางครั้งการเปลี่ยนแปลงอาจนำมาซึ่งสิ่งที่ดีกว่า");
        b8.setCredit("credit: http://www.kalyanamitra.org/th/Aesop_detail.php?page=4060");

        b9 = new DataTale();
        b9.setName("แม่ม่ายกับแม่ไก่");
        b9.setLmage((int)R.drawable.b9);
        b9.setName1("เรื่องมีอยู่ว่า");
        b9.setData1("แม่ม่ายคนหนึ่งเลี้ยงแม่ไก่ไว้หนึ่งตัว ทุก ๆ เช้าแม่ไก่จะออกไข่ให้เธอวันละฟอง วันหนึ่งแม่ม่ายเกิด\n" +
                "ความโลภอยากให้แม่ไก่ออกไข่เยอะๆ เพื่อจะได้นำไปขายที่ตลาด เธอจึงเพิ่มปริมาณข้าวเปลือกให้แม่ไก่กิน\n" +
                "เป็นสองเท่า เพื่อที่จะให้แม่ไก่ออกไข่ได้ทีละหลาย ๆ ฟอง แต่แล้วแม่ไก่ก็ยังออกไข่ได้วันละฟองเหมือนเดิมเหมือนทุกวันที่ผ่านมา");
        b9.setName2("นิทานเรื่องนี้สอนให้รู้ว่า");
        b9.setData2("จงพอใจในสิ่งที่ตนมีอยู่");
        b9.setCredit("credit: http://www.kalyanamitra.org/th/Aesop_detail.php?page=4007");

        b10 = new DataTale();
        b10.setName("ต้นสนกับพงหนาม");
        b10.setLmage((int)R.drawable.b10);
        b10.setName1("เรื่องมีอยู่ว่า");
        b10.setData1("ณ ป่าแห่งหนึ่ง มีต้นสนกับพงหนามขึ้นอยู่ใกล้ ๆ กัน ต้นสนมักชอบเหน็บแนมพงหนามเป็นประจำว่า\n" +
                "ข้าเป็นต้นสนที่มีประโยชน์ ใช้สร้างบ้านและเครื่องเรือนสารพัด ในขณะที่เจ้ากลับไม่มีค่าอะไรเลย\n" +
                "พงหนามจึงตอบกลับไปว่า ถูกแล้วที่ข้าเกิดมาต่ำต้อยไม่มีประโยชน์ แต่ถ้าเจ้าลองหันไปเห็นคนตัดไม้ที่\n" +
                "กำลังถือขวานกับเลื่อยมาทางนี้ แล้วเจ้าจะอยากเป็นต้นสนหรือพงหนามอย่างข้าล่ะ");
        b10.setName2("นิทานเรื่องนี้สอนให้รู้ว่า");
        b10.setData2("อย่าทำตัวเด่นจะเป็นภัย");
        b10.setCredit("credit: http://www.kalyanamitra.org/th/Aesop_detail.php?page=4097");

        b11 = new DataTale();
        b11.setName("แมงป่องกับเต่าทอง");
        b11.setLmage((int)R.drawable.b11);
        b11.setName1("เรื่องมีอยู่ว่า");
        b11.setData1("แมงป่องและเต่าทองเป็นเพื่อนกัน  ั้งสองจะคอยช่วยเหลือซึ่งกันและกันเสมอ จนกระทั่งวันหนึ่ง\n" +
                "เต่าทองต้องข้ามแม่น้ำที่ไหลเชี่ยวและเต็มไปด้วยอันตราย แมงป่องจึงอาสาให้เต่าทองขี่หลังของมัน\n" +
                "และบอกว่าจะดูแลเป็นอย่างดี แต่ในขณะที่กำลังจะข้ามแม่น้ำไปนั้น แมงป่องกลับใช้เหล็กในที่ปลายหางต่อยเจ้าเต่าทอง\n" +
                "เต่าทองนอนร้องครวญครางด้วยความเจ็บปวด แล้วถามแมงป่องว่า เจ้าลืมสัญญาที่เคยให้ไว้กับข้าแล้วหรือ\n" +
                "แมงป่องยิ้มอย่างเจ้าเล่ห์และตอบว่า ก็มันเป็นสัญชาตญาณของข้านี่นา");
        b11.setName2("นิทานเรื่องนี้สอนให้รู้ว่า");
        b11.setData2("อย่าเชื่อถือใครเพียงเพราะคำพูด แต่จงดูพฤติกรรมในอดีตของเขาด้วย");
        b11.setCredit("credit: http://www.kalyanamitra.org/th/Aesop_detail.php?page=3993");

        b12 = new DataTale();
        b12.setName("หมาป่ากับลูกแกะ");
        b12.setLmage((int)R.drawable.b12);
        b12.setName1("เรื่องมีอยู่ว่า");
        b12.setData1("กาลครั้งหนึ่งนานมาแล้ว มีหมาป่าตัวหนึ่งกำลังกินน้ำอยู่ที่น้ำตกบนเนินเขา และพอมันเงยหน้าขึ้นมาก็\n" +
                "มองเห็นลูกแกะตัวหนึ่งกำลังจะกินน้ำที่ใหลลงไปเบื้องล่าง มันคิดที่จะจับลูกแกะกินเป็นอาหาร จึงหาข้ออ้าง\n" +
                "และตะโกนว่า เจ้าบังอาจมากวนน้ำที่ข้ากำลังกินอยู่ให้เลอะโคลนสกปรกได้อย่างไร\n" +
                "เปล่านะท่าน ข้าเปล่า เจ้าลูกแกะพูด ถ้าน้ำข้างบนนั้นมีโคลนปนอยู่ ก็แสดงว่าข้าไม่ได้เป็นต้น\n" +
                "เหตุแน่นอนเพราะน้ำนี้ใหลลงมาจากตรงที่ท่านยืนอยู่ก่อนแล้ว\n" +
                " เจ้าหมาป่าจึงพูดกลับไปว่า ถ้าอย่างนั้นละก็ ทำไมช่วงเวลานี้เมื่อปีที่แล้วเจ้าถึงมาด่าว่าข้าเสียๆ หายๆ ด้วย\n" +
                "เป็นไปไม่ได้หรอกท่าน เจ้าหมาป่าคำราม ถ้าไม่ใช่เจ้า ก็ต้องเป็นพ่อของเจ้าแน่ๆ ว่า\n" +
                "แล้วเจ้าหมาป่าก็กระโจนเข้าตะครุบลูกแกะผู้น่าสงสาร และขย้ำกินอย่างไม่สนใจเหตุผลของเจ้าแกะนั้นเลย");
        b12.setName2("นิทานเรื่องนี้สอนให้รู้ว่า");
        b12.setData2("คนชั่วมักหาข้อแก้ตัวให้กับการกระทำของตัวเองได้เสมอ");
        b12.setCredit("credit: http://www.kalyanamitra.org/th/Aesop_detail.php?page=4609");

        b13 = new DataTale();
        b13.setName("สิงโตชรา");
        b13.setLmage((int)R.drawable.b13);
        b13.setName1("เรื่องมีอยู่ว่า");
        b13.setData1("สิงโตชราตัวหนึ่ง กำลังนอนรอความตายอย่างทุกข์ทรมานจากโรคภัยที่มารุมเร้าอยู่ในถ้ำ บรรดาสัตว์ป่า\n" +
                "พากันกันเยี่ยมเยือนเพื่อหวังจะแก้แค้น หมูป่าใช้เขี้ยวแทงสิงโตจนล้มลง จากนั้นวัวก็เข้ามาไล่ขวิด ส่วนลาใช้\n" +
                "เท้าดีดไปที่หน้าของสิงโตจนตาบวมปูด สิงโตได้แต่รำพึงกับตัวเองว่า ข้าต้องโดนสัตว์อ่อนแอพวกนี้\n" +
                "ทำร้าย โดยที่ข้าไม่มีแรงตอบโต้แม้แต่น้อย มันช่างน่าเจ็บใจยิ่งกว่าความตายเสียอีก");
        b13.setName2("นิทานเรื่องนี้สอนให้รู้ว่า");
        b13.setData2("คนที่เคยใช้อำนาจข่มเหงผู้อื่น หากหมดอำนาจเมื่อใดก็จะไม่มีใครเขาเกรงกลัว");
        b13.setCredit("credit: http://www.kalyanamitra.org/th/Aesop_detail.php?page=4548");

        order = (TextView) findViewById(R.id.MO1);
        order.setText(b1.getName());
        order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TaleActivity.this,TaletellActivity.class);
                intent.putExtra("data", b1);
                startActivity(intent);
            }
        });

        order = (TextView) findViewById(R.id.MO2);
        order.setText(b2.getName());
        order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TaleActivity.this,TaletellActivity.class);
                intent.putExtra("data", b2);
                startActivity(intent);
            }
        });

        order = (TextView) findViewById(R.id.MO3);
        order.setText(b3.getName());
        order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TaleActivity.this,TaletellActivity.class);
                intent.putExtra("data", b3);
                startActivity(intent);
            }
        });

        order = (TextView) findViewById(R.id.MO4);
        order.setText(b4.getName());
        order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TaleActivity.this,TaletellActivity.class);
                intent.putExtra("data", b4);
                startActivity(intent);
            }
        });

        order = (TextView) findViewById(R.id.MO5);
        order.setText(b5.getName());
        order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TaleActivity.this,TaletellActivity.class);
                intent.putExtra("data", b5);
                startActivity(intent);
            }
        });

        order = (TextView) findViewById(R.id.MO6);
        order.setText(b6.getName());
        order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TaleActivity.this,TaletellActivity.class);
                intent.putExtra("data", b6);
                startActivity(intent);
            }
        });

        order = (TextView) findViewById(R.id.MO7);
        order.setText(b7.getName());
        order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TaleActivity.this,TaletellActivity.class);
                intent.putExtra("data", b7);
                startActivity(intent);
            }
        });

        order = (TextView) findViewById(R.id.MO8);
        order.setText(b8.getName());
        order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TaleActivity.this,TaletellActivity.class);
                intent.putExtra("data", b8);
                startActivity(intent);
            }
        });

        order = (TextView) findViewById(R.id.MO9);
        order.setText(b9.getName());
        order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TaleActivity.this,TaletellActivity.class);
                intent.putExtra("data", b9);
                startActivity(intent);
            }
        });

        order = (TextView) findViewById(R.id.M10);
        order.setText(b10.getName());
        order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TaleActivity.this,TaletellActivity.class);
                intent.putExtra("data", b10);
                startActivity(intent);
            }
        });

        order = (TextView) findViewById(R.id.M11);
        order.setText(b11.getName());
        order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TaleActivity.this,TaletellActivity.class);
                intent.putExtra("data", b11);
                startActivity(intent);
            }
        });

        order = (TextView) findViewById(R.id.M12);
        order.setText(b12.getName());
        order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TaleActivity.this,TaletellActivity.class);
                intent.putExtra("data", b12);
                startActivity(intent);
            }
        });

        order = (TextView) findViewById(R.id.M13);
        order.setText(b13.getName());
        order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TaleActivity.this,TaletellActivity.class);
                intent.putExtra("data", b13);
                startActivity(intent);
            }
        });

    }
}
