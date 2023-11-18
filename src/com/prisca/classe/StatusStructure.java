package com.prisca.classe;
import java.util.TreeSet;

/**
 * Classe représentant la structure de statut.
 */
public class StatusStructure {
    private TreeSet<Segment> segments;

    /**
     * Constructeur de la classe StatusStructure.
     */
    public StatusStructure() {
        this.segments = new TreeSet<>();
    }

    /**
     * Renvoie le voisin gauche du segment spécifié dans la structure de statut.
     *
     * @param segment le segment dont on veut obtenir le voisin gauche
     * @return le voisin gauche du segment, ou null s'il n'y en a pas
     */
    public Segment getLeftNeighbor(Segment segment) {
        return segments.lower(segment);
    }

    /**
     * Renvoie le voisin droit du segment spécifié dans la structure de statut.
     *
     * @param segment le segment dont on veut obtenir le voisin droit
     * @return le voisin droit du segment, ou null s'il n'y en a pas
     */
    public Segment getRightNeighbor(Segment segment) {
        return segments.higher(segment);
    }

    /**
     * Insère le segment spécifié dans la structure de statut.
     *
     * @param segment le segment à insérer
     */
    public void insertSegment(Segment segment) {
        segments.add(segment);
    }

    /**
     * Supprime le segment spécifié de la structure de statut.
     *
     * @param segment le segment à supprimer
     */
    public void removeSegment(Segment segment) {
        segments.remove(segment);
    }
}