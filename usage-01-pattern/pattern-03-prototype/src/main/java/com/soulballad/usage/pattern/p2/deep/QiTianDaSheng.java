package com.soulballad.usage.pattern.p2.deep;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;

public class QiTianDaSheng extends Monkey implements Cloneable, Serializable {

    public JinGuBang jinGuBang;

    public QiTianDaSheng() {
        this.birthday = new Date();
        this.jinGuBang = new JinGuBang();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {

        return this.deepClone();
    }

    public Monkey deepClone() {

        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        try {
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);
            QiTianDaSheng daSheng = (QiTianDaSheng) ois.readObject();
            daSheng.birthday = new Date();

            return daSheng;

        } catch (Exception e) {

            e.printStackTrace();
        }

        return null;
    }

    public QiTianDaSheng shallowClone(QiTianDaSheng monkey) {

        QiTianDaSheng daSheng = new QiTianDaSheng();
        daSheng.weight = monkey.weight;
        daSheng.height = monkey.height;
        daSheng.jinGuBang = monkey.jinGuBang;
        daSheng.birthday = new Date();

        return daSheng;
    }
}