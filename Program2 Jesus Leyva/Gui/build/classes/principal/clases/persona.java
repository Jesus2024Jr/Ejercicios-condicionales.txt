����   4 t
  H	  I	  J	  K	  L	  M N
  H
  O P Q R
  S T U T V A W A X Y	 Z [
 \ ] ^ _
  H ` a Nombre Ljava/lang/String; Apellido 	Direccion Edad lista Ljava/util/List; 	Signature $Ljava/util/List<Ljava/lang/String;>; <init> K(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V Code LineNumberTable LocalVariableTable this Lclases/persona; nombre 	getNombre ()Ljava/lang/String; 	setNombre (Ljava/lang/String;)V getApellido setApellido getDireccion setDireccion getEdad setEdad getLista ()Ljava/util/List; &()Ljava/util/List<Ljava/lang/String;>; setDatos (Ljava/util/List;)V LocalVariableTypeTable '(Ljava/util/List<Ljava/lang/String;>;)V agregar ListaPersonas ()V persona StackMapTable b obtenerLista sb Ljava/lang/StringBuilder; <clinit> 
SourceFile persona.java # >            java/lang/StringBuilder c d   ,  . e , f g h i j k l m n java/lang/String o p q r s . 
 java/util/ArrayList clases/persona java/lang/Object java/util/Iterator append -(Ljava/lang/String;)Ljava/lang/StringBuilder; toString java/util/List add (Ljava/lang/Object;)Z iterator ()Ljava/util/Iterator; hasNext ()Z next ()Ljava/lang/Object; java/lang/System out Ljava/io/PrintStream; java/io/PrintStream println !                          
     !    "   # $  %   �     *� **� � *,� *-� *� �    &                  '   4     ( )      *                      + ,  %   /     *� �    &       $ '        ( )    - .  %   >     *+� �    &   
    +  , '        ( )          / ,  %   /     *� �    &       2 '        ( )    0 .  %   >     *+� �    &   
    9  : '        ( )          1 ,  %   /     *� �    &       @ '        ( )    2 .  %   >     *+� �    &   
    G  H '        ( )          3 ,  %   /     *� �    &       N '        ( )    4 .  %   >     *+� �    &   
    U  V '        ( )          5 6  %   .     � �    &       \ '        ( )   !    7  8 9  %   Q     *W+� �    &   
    c  d '        ( )          :         "  !    ; 	 < $  %   �     8� � Y� *� 	
� 	+� 	� 	,� 	� 	-� 	� 	� �  W�    &   
    g 7 h '   *    8       8      8      8    	 = >  %   n     '� �  K*�  � *�  � L� +� ���    &       j  k # l & m '       ?   @    � 	 A�  	 B ,  %   �     7� Y� K� �  L+�  � +�  � M*,� 	� 	W���*� �    &       o  p $ q / r 2 s '     $  ?    / C D   @    �   A�    E >  %   #      � Y� � �    &         F    G