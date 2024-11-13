package liste;

/**
 * La classe Noeud représente un élément dans une liste chaînée.
 */
public class Noeud {
    private Object element;
    private Noeud suivant;

    /**
     * Constructeur de la classe Noeud.
     *
     * @param e L'élément à stocker dans le noeud.
     * @param suivant Le noeud suivant auquel ce noeud est lié.
     */
    public Noeud(int e, Noeud suivant) {
        element = e;
        this.suivant = suivant;
    }

    /**
     * Récupère l'élément stocké dans ce noeud.
     *
     * @return L'élément stocké dans le noeud.
     */
    public Object getElement() {
        return element;
    }

    /**
     * Définit l'élément de ce noeud.
     *
     * @param element Le nouvel élément à stocker dans le noeud.
     */
    public void setElement(Object element) {
        this.element = element;
    }

    /**
     * Récupère le noeud suivant dans la liste chaînée.
     *
     * @return Le noeud suivant.
     */
    public Noeud getSuivant() {
        return suivant;
    }

    /**
     * Définit le noeud suivant.
     *
     * @param suivant Le nouveau noeud suivant.
     */
    public void setSuivant(Noeud suivant) {
        this.suivant = suivant;
    }

    /**
     * Retourne une représentation sous forme de chaîne de caractères du noeud.
     *
     * @return La représentation en chaîne du noeud, sous la forme "Noeud(element)".
     */
    public String toString() {
        return "Noeud(" + element + ")";
    }
}

