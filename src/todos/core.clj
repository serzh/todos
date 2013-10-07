(ns todos.core)

(def todos (ref []))

(defn new-todo [text]
  {:text text})

(defn save-todo [todo]
  (dosync
    (alter todos conj todo)))

(defn all-todos []
  @todos)

(defn remove-todo [todo]
  (dosync
    (alter todos #(filter %2 %1) todo)))
