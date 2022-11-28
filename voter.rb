def vote(voter, rank, name)
  @candidates = ['bryn', 'bob', 'steve', 'man']
  @preferences = name

    if name == 'bryn'
      @candidate_one.push(rank)
    end
  
end