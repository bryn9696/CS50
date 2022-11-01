def mario
  print "what height? "
  height = gets.chomp.to_i
  i = 1
  while i <= height
    [0..height].each do |x|
      (height - i).times {print ' '}
      i.times {print "#"}
      print " "
      i.times {print "#"}
      puts ""
      i += 1
    end
  end
end