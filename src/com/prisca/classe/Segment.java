package com.prisca.classe;


/**
 * Classe représentant un segment.
 */
public class Segment implements Comparable<Segment> {
    private EventPoint startPoint;
    private EventPoint endPoint;

    /**
     * Constructeur de la classe Segment.
     *
     * @param startPoint le point de départ du segment
     * @param endPoint   le point d'arrivée du segment
     */
    public Segment(EventPoint startPoint, EventPoint endPoint) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }

    /**
     * Renvoie le point de départ du segment.
     *
     * @return le point de départ du segment
     */
    public EventPoint getStartPoint() {
        return startPoint;
    }

    /**
     * Renvoie le point d'arrivée du segment.
     *
     * @return le point d'arrivée du segment
     */
    public EventPoint getEndPoint() {
        return endPoint;
    }

    /**
     * Compare le segment courant avec le segment spécifié.
     *
     * @param other le segment à comparer
     * @return une valeur négative si le segment courant est inférieur au segment spécifié,
     *         une valeur positive si le segment courant est supérieur au segment spécifié,
     *         zéro si les segments sont égaux
     */
    @Override
    public int compareTo(Segment other) {
        // Compare les segments en fonction de leurs points de départ
        int startPointComparison = this.startPoint.compareTo(other.startPoint);
        if (startPointComparison != 0) {
            return startPointComparison;
        }
        // Si les points de départ sont les mêmes, compare en fonction des points d'arrivée
        return this.endPoint.compareTo(other.endPoint);
    }
}