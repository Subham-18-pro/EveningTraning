# Free Fire Max - Inspired Battle Royale Game
# A Python-based simple battle royale game simulation

import random
import time

class Player:
    """Player class representing each player in the game"""
    
    def __init__(self, name, player_id):
        self.name = name
        self.player_id = player_id
        self.health = 100
        self.armor = 0
        self.position = [random.randint(0, 100), random.randint(0, 100)]
        self.ammo = 30
        self.kills = 0
        self.is_alive = True
        self.weapon = "Pistol"
        self.inventory = []
    
    def move(self, direction):
        """Move player in specified direction"""
        if direction == "north":
            self.position += 5
        elif direction == "south":
            self.position -= 5
        elif direction == "east":
            self.position += 5
        elif direction == "west":
            self.position -= 5
        print(f"{self.name} moved to position {self.position}")
    
    def shoot(self, target):
        """Shoot at target player"""
        if self.ammo > 0:
            self.ammo -= 1
            damage = random.randint(15, 35)
            print(f"{self.name} shoots {target.name} with {self.weapon}!")
            target.take_damage(damage)
            return True
        else:
            print(f"{self.name} is out of ammo!")
            return False
    
    def take_damage(self, damage):
        """Take damage with armor absorption"""
        if self.armor > 0:
            absorbed = min(damage // 2, self.armor)
            self.armor -= absorbed
            damage -= absorbed
        
        self.health -= damage
        print(f"{self.name} takes {damage} damage! Health: {self.health}")
        
        if self.health <= 0:
            self.health = 0
  
