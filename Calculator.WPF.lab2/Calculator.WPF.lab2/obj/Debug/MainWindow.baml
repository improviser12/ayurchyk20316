   M S B A M L   `   `   `  ����N  JCalculator.WPF.lab2, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null9!clr-namespace:Calculator.WPF.lab2Calculator.WPF.lab2  5   	   $    Calculator.WPF.lab2.MainWindow   5   	   \ XPresentationFramework, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35R NWindowsBase, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35W SPresentationCore, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35D 9http://schemas.microsoft.com/winfx/2006/xaml/presentation    5   	   R NSystem.Xaml, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089:x,http://schemas.microsoft.com/winfx/2006/xaml     5   	   @d2http://schemas.microsoft.com/expression/blend/2008     5   	   Jmc;http://schemas.openxmlformats.org/markup-compatibility/2006     5   	   3local!clr-namespace:Calculator.WPF.lab2     5   	     � Title$  
Calculator��5   	   $	��500��6   $	��340��6)   $	��500��5	   	   $	��340��6   .��5      � $��5q�6    � ColumnDefinitions 5   
   �� 5      �� 5      �� 5      �� 5       � RowDefinitions 5   
   �� 5      �� 5      �� 5      �� 5      �� 5      �� 5      �� 5      �� 5      .+�5    
   �� -   5         ��Name$
 num7��5       $��0��6   $��4��6/   $��7��6<   $��18(�6H   $��DemiBold"�6V   
�������
�������$��1q�6�   6�   �� 5!   
   -   5        $
 num4��5!      $��0��6   $��5��6/   $��4��6<   $��18(�6H   $��DemiBold"�6V   
�������
�������$��1q�6�   6�   �� 5"   
   -   5        $
 num1��5"      $��0��6   $��6��6/   $��1��6<   $��18(�6H   $��DemiBold"�6V   
�������
�������$��1q�6�   6�   �� 5#   
   -   5        $ 
changeSymb��5#      $��0��6%   $��7��65   $��±��6B   $��18(�6N   $��DemiBold"�6\   
�������
�������$��1q�6�   6�   �� 5&   
   -   5        $
 num8��5&      $��1��6   $��4��6/   $��8��6<   $��18(�6H   $��DemiBold"�6V   
�������
�������$��1q�6�   6�   �� 5'   
   -   5        $
 num5��5'      $��1��6   $��5��6/   $��5��6<   $��18(�6H   $��DemiBold"�6V   
�������
�������$��1q�6�   6�   �� 5(   
   -   5        $
 num2��5(      $��1��6   $��6��6/   $��2��6<   $��18(�6H   $��DemiBold"�6V   
�������
�������$��1q�6�   6�   �� 5)   
   -   5        $
 num0��5)      $��1��6   $��7��6/   $��0��6<   $��18(�6H   $��DemiBold"�6V   
�������
�������$��1q�6�   6�   �� 5,   
   -	   5        $
 num9��5,      $��2��6   $��4��6/   $��9��6<   $��18(�6H   $��DemiBold"�6V   
�������
�������$��1q�6�   6�   �� 5-   
   -
   5        $
 num6��5-      $��2��6   $��5��6/   $��6��6<   $��18(�6H   $��DemiBold"�6V   
�������
�������$��1q�6�   6�   �� 5.   
   -   5        $
 num3��5.      $��2��6   $��6��6/   $��3��6<   $��18(�6H   $��DemiBold"�6V   
�������
�������$��1q�6�   6�   �� 5/   
   -   5        $ comma��5/      $��2��6    $��7��60   $��,��6=   $��18(�6I   $��DemiBold"�6W   
�������
�������$��1q�6�   6�   �� 52   
   -   5        $ divide��52      $��3��6!   $��4��61   $��÷��6>   $��18(�6J   $��DemiBold"�6X   
���r���
�������$��1q�6�   6�   �� 53   
   -   5        $ multiply��53      $��3��6#   $��5��63   $��×��6@   $��18(�6L   $��DemiBold"�6Z   
���r���
�������$��1q�6�   6�   �� 54   
   -   5        $ minus��54      $��3��6    $��6��60   $��-��6=   $��18(�6I   $��DemiBold"�6W   
���r���
�������$��1q�6�   6�   �� 55   
   -   5        $
 plus��55      $��3��6   $��7��6/   $��+��6<   $��18(�6H   $��DemiBold"�6V   
���r���
�������$��1q�6�   6�   �� 58   
   -   5        $ dellAll��58      $��0��6"   $��2��62   $��3��6F   $��C��6S   $��18(�6_   $��DemiBold"�6m   
���r���
�������$��1q�6�   6�   �� 59   
   -   5        $ equals��59      $��2��6!   $��2��61   $��3��6E   $��=��6R   $��18(�6^   $��DemiBold"�6l   
���r���
�������$��1q�6�   6�   �� 5<   
   -   5        $ dellLast��5<      $��0��6#   $��4��63   $��2��6G   $��CE��6T   $��18(�6a   $��DemiBold"�6o   
���r���
�������$��1q�6�   6�   �� 5?   
   -   5         ��Name$ poleEd2��5?      {�.  $��0��65   $��0��6B   $��4��6R    �� 
CaretBrush
 �����$��33(�6y    �� TextAlignment$ Right=�6�   6�   �� 5@   
   -   5        $ poleEd1��5@      $��1��6#   $��0��60   $��4��6@   
 �����$��33(�6g   $ Right=�6u   6�   5A      5B      