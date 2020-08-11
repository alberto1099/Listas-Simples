class node:
    def __init__(self, info=None, sig=None):
        self.info = info
        self.sig = sig

# Creamos la clase linked_list


class linked_list:
    def __init__(self):
        self.cabeza = None

    # Método para agregar elementos en el frente de la linked list
    def Agregar_por_Cabeza(self, info):
        self.cabeza = node(info=info, sig=self.cabeza)

    # Método para verificar si la estructura de datos esta vacia
    def is_vacia(self):
        return self.cabeza == None

    # Método para agregar elementos al final de la linked list
    def Agregar_al_Final(self, info):
        if not self.cabeza:
            self.cabeza = node(info=info)
            return
        curr = self.cabeza
        while curr.sig:
            curr = curr.sig
        curr.sig = node(info=info)

    # Método para eleminar nodos
    def Eliminar_nodo(self, key):
        curr = self.cabeza
        prev = None
        while curr and curr.info != key:
            prev = curr
            curr = curr.sig
        if prev is None:
            self.cabeza = curr.sig
        elif curr:
            prev.sig = curr.sig
            curr.sig = None

    # Método para obtener el ultimo nodo
    def Obtener_ultimo_nodo(self):
        temp = self.cabeza
        while(temp.sig is not None):
            temp = temp.sig
        return temp.info

    # Método para imprimir la lista de nodos
    def Mostrar_lista(self):
        node = self.cabeza
        while node != None:
            print(node.info, end=" => ")
            node = node.sig


s = linked_list()
s.Agregar_por_Cabeza(5)
s.Agregar_al_Final(8)
s.Agregar_por_Cabeza(9)  # Instancia de la clase
# Agregamos otro elemento al frente del nodo
s.Mostrar_lista()
print()
s.Eliminar_nodo(1)
s.Mostrar_lista()
