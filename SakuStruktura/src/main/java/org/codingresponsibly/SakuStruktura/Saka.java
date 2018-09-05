package org.codingresponsibly.SakuStruktura;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Saka<T> implements Iterable<Saka<T>> {

    public T data;
    public Saka<T> saka;
    public List<Saka<T>> sakele;

    public boolean ciaKamienas() {
        return saka == null;
    }

    public boolean ciaSakosPabaiga() {
        return sakele.size() == 0;
    }

    public List<Saka<T>> elementsIndex;

    public Saka(T data) {
        this.data = data;
        this.sakele = new LinkedList<Saka<T>>();
        this.elementsIndex = new LinkedList<Saka<T>>();
        this.elementsIndex.add(this);
    }

    public Saka<T> addJungtis(T jungtis) {
        Saka<T> jungtisSakele = new Saka<T>(jungtis);
        jungtisSakele.saka = this;
        this.sakele.add(jungtisSakele);
        this.regJungtisPaieskai(jungtisSakele);
        return jungtisSakele;
    }

    public int getLevel() {
        if (this.ciaKamienas())
            return 0;
        else
            return saka.getLevel() + 1;
    }

    public void regJungtisPaieskai(Saka<T> node) {
        elementsIndex.add(node);
        if (saka != null)
            saka.regJungtisPaieskai(node);
    }

    public Saka<T> findTreeNode(Comparable<T> cmp) {
        for (Saka<T> element : this.elementsIndex) {
            T elData = element.data;
            if (cmp.compareTo(elData) == 0)
                return element;
        }

        return null;
    }

    @Override
    public String toString() {
        return data != null ? data.toString() : "[nera duomenu]";
    }

    @Override
    public Iterator<Saka<T>> iterator() {
        MedzioSakaIter<T> iter = new MedzioSakaIter<T>(this);
        return iter;
    }

}