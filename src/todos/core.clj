(ns todos.core)

(def todos (ref []))

(defn new-todo [text]
  {:text text})

(defn save-todo [todo]
  (dosync
    conj todos todo))

(defn all-todos
  todos)
