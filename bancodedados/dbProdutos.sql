PGDMP                          {         
   db_produto    12.10    12.10                0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false                       0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false                       0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false                       1262    57490 
   db_produto    DATABASE     �   CREATE DATABASE db_produto WITH TEMPLATE = template0 ENCODING = 'UTF8' LC_COLLATE = 'Portuguese_Brazil.1252' LC_CTYPE = 'Portuguese_Brazil.1252';
    DROP DATABASE db_produto;
                postgres    false            �            1259    57493    tbl_produto    TABLE       CREATE TABLE public.tbl_produto (
    id_produto integer NOT NULL,
    nome_produto character varying(100) NOT NULL,
    detalhe_produto text,
    foto_produto character varying(255) NOT NULL,
    preco_produto real NOT NULL,
    disponivel_produto integer
);
    DROP TABLE public.tbl_produto;
       public         heap    postgres    false            �            1259    57491    tbl_produto_id_produto_seq    SEQUENCE     �   CREATE SEQUENCE public.tbl_produto_id_produto_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 1   DROP SEQUENCE public.tbl_produto_id_produto_seq;
       public          postgres    false    203            	           0    0    tbl_produto_id_produto_seq    SEQUENCE OWNED BY     Y   ALTER SEQUENCE public.tbl_produto_id_produto_seq OWNED BY public.tbl_produto.id_produto;
          public          postgres    false    202            �
           2604    57496    tbl_produto id_produto    DEFAULT     �   ALTER TABLE ONLY public.tbl_produto ALTER COLUMN id_produto SET DEFAULT nextval('public.tbl_produto_id_produto_seq'::regclass);
 E   ALTER TABLE public.tbl_produto ALTER COLUMN id_produto DROP DEFAULT;
       public          postgres    false    203    202    203                      0    57493    tbl_produto 
   TABLE DATA           �   COPY public.tbl_produto (id_produto, nome_produto, detalhe_produto, foto_produto, preco_produto, disponivel_produto) FROM stdin;
    public          postgres    false    203          
           0    0    tbl_produto_id_produto_seq    SEQUENCE SET     I   SELECT pg_catalog.setval('public.tbl_produto_id_produto_seq', 12, true);
          public          postgres    false    202            �
           2606    57501    tbl_produto tbl_produto_pkey 
   CONSTRAINT     b   ALTER TABLE ONLY public.tbl_produto
    ADD CONSTRAINT tbl_produto_pkey PRIMARY KEY (id_produto);
 F   ALTER TABLE ONLY public.tbl_produto DROP CONSTRAINT tbl_produto_pkey;
       public            postgres    false    203               �   x��Q�n�0������I7�A���b�q�H%��+����!�@�����)@��|�%s���1��+G��(��>!�n��T�55�;��ɦ�2rQQ�*�Oq�N��$�?$�ni�|ޠ�7�����2�����'�.r�N%�~��G��x�y�>ٯ����������(�*�,�$�]BJ���EI���}�@�Cd*��.��dJ�W��     